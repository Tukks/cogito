package com.tukks.cogito.controller;

import java.util.List;
import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tukks.cogito.dto.request.ThingsEditRequest;
import com.tukks.cogito.repository.ThingsRepository;
import com.tukks.cogito.service.NoteService;

import lombok.AllArgsConstructor;
import static com.tukks.cogito.service.SecurityUtils.getSub;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ThoughtController {

	private final Logger logger = LogManager.getLogger(getClass());

	private final ThingsRepository thingsRepository;
	private final NoteService noteService;

	@GetMapping("/thoughts")
	public List<Object> getAllThoughts() {
		logger.info("Get all elements");
		return thingsRepository.getAll(getSub());
	}

	@PostMapping("/save")
	public void save(@RequestBody String note) {
		logger.info("Saving new note");

		noteService.save(note);
	}

	@PatchMapping("/{id}")
	public void editThings(@PathVariable UUID id, @RequestBody ThingsEditRequest thingsEditRequest) {
		logger.info("Edit note, id : {}", id);
		noteService.editThings(id, thingsEditRequest);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable UUID id) {
		logger.info("Delete note, id : {}", id);

		noteService.delete(id);
	}

}
