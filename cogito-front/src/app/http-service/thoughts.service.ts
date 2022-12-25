import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { lastValueFrom, Observable, tap } from "rxjs";
import { CardType, Tag } from "../types/cards-link";
import { CogitoStoreService } from "../internal-service/store/cogito-store.service";
import { map } from "rxjs/operators";

@Injectable({
  providedIn: "root"
})
export class ThoughtsService {
  constructor(
    private httpClient: HttpClient,
    private cogitoStoreService: CogitoStoreService) {

  }


  public getAllthougts(): Observable<CardType[]> {
    return this.httpClient.get<CardType[]>("/api/thoughts").pipe(
      tap((values) => {
        this.cogitoStoreService.addCards(values);
      })
    );
  }

  public getThought(id: string): Observable<CardType> {
    return this.httpClient.get<CardType>("/api/thoughts/" + id);
  }

  public save(thingRequest: {
    note?: string;
    tags?: Tag[];
  }): Observable<CardType> {
    return this.httpClient.post<CardType>("/api/save", thingRequest).pipe(
      tap((card) => {
        this.cogitoStoreService.addCard(card);
      })
    );
  }

  public delete(id: string): Observable<number> {
    return this.httpClient.delete<number>(`/api/${id}`).pipe(
      tap(() => {
        this.cogitoStoreService.removeCard(id);
      })
    );
  }

  public editThing(
    id: string,
    thingRequest: {
      title?: string;
      note?: string;
      tags?: Tag[];
      comment?: string;
    }
  ): Observable<CardType> {
    return this.httpClient.patch<CardType>(`/api/${id}`, thingRequest).pipe(
      tap((cardModified) => {
        this.cogitoStoreService.editCard(cardModified);
      })
    );
  }

  public uploadImage(data: FormData): Promise<any> {
    return lastValueFrom(
      this.httpClient.post('/api/image', data)
      .pipe(map(value => `/api/image/${value}`)));
  }
}
