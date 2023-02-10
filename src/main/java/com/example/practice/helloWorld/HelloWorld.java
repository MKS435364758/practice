package com.example.practice.helloWorld;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloWorld {

    @GetMapping("/world")
    public  String  printHelloWorld(){
        return "Hello WOrld";
    }

    @GetMapping("/world/{name}")
    public  String  printHelloWorldName(@PathVariable("name") String name){
        return "Hello WOrld"+name;
    }
}
