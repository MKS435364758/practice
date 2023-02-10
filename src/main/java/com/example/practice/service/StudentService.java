package com.example.practice.service;


import com.example.practice.model.Student;
import com.example.practice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository repo;


    public List<Student> getAllStudent(){
        return repo.findAll();
    }

    public void //List<Student>
    addStudent(Student student){
        repo.save(student);
        //return repo.findAll();
    }


    public List getNameId(String name){
        List ids = new ArrayList();
        List<Student> studentLists = repo.findAll();
        studentLists.stream().forEach(x->{
            if(x.getFirstName().equals(name)){
                ids.add(x.getId());
            }
        });
        return repo.findAllById(ids);
    }

    public List<Student> searchStudent(String name) {

        return repo.findStudentByFirstName(name);
    }


}
