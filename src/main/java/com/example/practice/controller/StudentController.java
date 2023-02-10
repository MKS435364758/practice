package com.example.practice.controller;


import com.example.practice.model.Student;
import com.example.practice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentService student;

    @GetMapping("status")
    public String getStatus(){
        return "scussefull";
    }

    @GetMapping("/all")
    public List<Student> getAll(){
        return student.getAllStudent();
    }

    @GetMapping("/allDate")
    public ResponseEntity<Object> getAllStudent(){
        return new ResponseEntity<>(student.getAllStudent(), HttpStatus.OK);
    }

    //add/5/yash/balu/65/65/70
//    @GetMapping("add/{id}/{first}/{second}/{sub1}/{sub2}/{sub3}")
//    public List<Student> getAdd(@PathVariable("id") int id,@PathVariable("first") String first,@PathVariable("second") String second,@PathVariable("sub1") int sub1,@PathVariable("sub2") int sub2,@PathVariable("sub3") int sub3){
//        Student std = new Student();
//        std.setId(id);
//        std.setFirst_name(first);
//        std.setSecond_name(second);
//        std.setSubject_1(sub1);
//        std.setSubject_2(sub2);
//        std.setSubject_3(sub3);
//        return student.addStudent(std);
//    }

    @PostMapping("addStudent")
    public void addStudent( @RequestBody
            Student newStudent){
        student.addStudent(newStudent);
    }

    @PutMapping("updateStudent")
    public void updateStudent( @RequestBody
                            Student newStudent){
        student.addStudent(newStudent);
    }

    @GetMapping("/getids/{name}")
    public List getids(@PathVariable("name") String name){
       return student.getNameId(name);
    }

    @GetMapping("/search/{name}")
    public List<Student> searchByName(@PathVariable("name") String  name){
        return student.searchStudent(name);
    }


}
