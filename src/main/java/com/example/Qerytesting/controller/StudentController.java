package com.example.Qerytesting.controller;


import com.example.Qerytesting.model.Student;
import com.example.Qerytesting.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/student")
    public List<Student> findAllStudents() {
        return service.getStudents();
    }

    @PostMapping("/savestudent")
    public Student addStudent(@RequestBody Student student) {
        return service.saveStudent(student);

    }
    ///@GetMapping("/allstudent")
    ///  public List<Student> getAllStudent() {
    ///  return service.getStudent();
    // }

    /// @GetMapping("/Allstudents/{id}")
    ///public List<Student> getByName(@PathVariable Long id ) {
    /// return service.getByName(id);
    // }

    //////@GetMapping("/allstudents/{id}/{name}")
    /////public List<Student>getByName(@PathVariable Long id,@PathVariable String name){
    ////return service.getByName(id,name);


   //// @PutMapping("updatestudent/{id}")
    ////public Integer updateByName(@PathVariable @RequestBody Long id) {
      ////return  service.updateStudent(id);
    ///}

    @DeleteMapping("/deleteby/{id}")
    public void deleteStudent(@PathVariable Long id){
        service.deleteById(id);
    }
}

