package com.kata.foobarquix.mapper;

import com.kata.foobarquix.dto.ResultDto;

public class ResultDtoMapper {
	
	public static ResultDto toResultDto(String result) {
		return new ResultDto(result);
	}

}
