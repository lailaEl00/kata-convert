package com.kata.foobarquix.services.impl;

import org.springframework.stereotype.Service;

import com.kata.foobarquix.services.IFooBarQuixService;

@Service
public class FooBarQuixServiceImpl implements IFooBarQuixService {

    @Override
    public String convertNumber(int inputNumber) {
 	StringBuilder sb = new StringBuilder();

        if(inputNumber % 3 ==0)
            sb.append("Foo");
        if(inputNumber % 5 ==0)
            sb.append("Bar");
        if(String.valueOf(inputNumber).contains("3"))
            sb.append("Foo");
        if(String.valueOf(inputNumber).contains("5"))
            sb.append("Bar");
        if(String.valueOf(inputNumber).contains("7"))
            sb.append("Quix");
        if(sb.toString().isEmpty())
            return String.valueOf(inputNumber);

	return sb.toString();

    }
}
