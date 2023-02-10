package com.example.practice.service;


import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public double add(double first, double second){
        return first + second;
    }

    public double divide(double first, double second){
        return first / second;
    }
}
