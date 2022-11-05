package com.tukks.mythoughtback.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;

@Builder
@Jacksonized
@Getter
public class TagEditRequest {

	private String tag;

}
