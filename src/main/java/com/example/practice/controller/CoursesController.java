package com.example.practice.controller;


import com.example.practice.model.Courses;
import com.example.practice.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("courses")
public class CoursesController {

    @Autowired
    CourseService courseService;

    @GetMapping("all")
    public List<Courses> getAll(){
        return courseService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody Courses course){
        courseService.add(course);
    }

}
