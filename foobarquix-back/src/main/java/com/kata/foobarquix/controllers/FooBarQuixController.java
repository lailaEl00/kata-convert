package com.kata.foobarquix.controllers;

import com.kata.foobarquix.dto.ResultDto;
import com.kata.foobarquix.mapper.ResultDtoMapper;
import com.kata.foobarquix.services.IFooBarQuixService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foo-bar-quix")
public class FooBarQuixController {

    @Autowired
    private IFooBarQuixService fooBarQuixServiceImpl;

    @GetMapping( path = "/{inputNumber}", produces = {MediaType.APPLICATION_JSON_VALUE} )
    @CrossOrigin(origins = {"http://localhost:8080", "http://localhost:4200"})
    public ResultDto convertNumber(int inputNumber) {
    	return ResultDtoMapper.toResultDto(fooBarQuixServiceImpl.convertNumber(inputNumber));
    }

}
