package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class StudentController {
    HashMap<Integer,Student> studentHashMap = new HashMap<>();

    @PostMapping("/addStudent")
    public void  addStudent(@RequestBody Student student){
        int studentKey = student.getRollNo();
        studentHashMap.put(studentKey,student);
    }
    @GetMapping("/getStudent")
    public Student getStudent(@RequestParam("rollNo")Integer rollNo){
        return studentHashMap.get(rollNo);
    }
}
