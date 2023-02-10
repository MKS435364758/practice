package com.example.practice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.practice.service.CalculatorService;

@RestController
@RequestMapping("calculate")
public class CalculatorController {


    @Autowired
    CalculatorService cal;

    @GetMapping("divide/{first}/{second}")
    public ResponseEntity<Object> divide(@PathVariable("first") double first,@PathVariable("second") double second){

        if(second == 0) return new ResponseEntity<>((int)first + " can't divide with "+(int)second,HttpStatus.FORBIDDEN);
        else return new ResponseEntity<>(cal.divide(first,second),HttpStatus.OK);
    }



    @GetMapping("add/{first}/{second}")
    public ResponseEntity<Object> add(@PathVariable("first") double first, @PathVariable("second") double second){
        return new ResponseEntity<>(cal.add(first,second), HttpStatus.OK) ;
    }
}
