package com.example.practice.service;


import com.example.practice.model.Courses;
import com.example.practice.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository repo;

    public List<Courses> getAll(){
        return repo.findAll();
    }

    public void add(Courses course){
        repo.save(course);
    }

}
