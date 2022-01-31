package com.example.Qerytesting.service;

import com.example.Qerytesting.model.Student;
import com.example.Qerytesting.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    public List<Student> getStudents() {
        return repository.findAll();

    }
    ///public  List<Student> getStudent() {
    ///  return repository.getAllStudent();
    // }

    ///public List<Student>getByName(Long id){
    // return repository.findByName(id);

    //}


    //// public List<Student>getByName(Long id ,String name){
    ////  return repository.findByName(id,name);
    // }

     ///public void updateStudent(Long id) {
        //   repository.updateStud(id);
   // }

        public void deleteById(Long id){
        repository.deleteStud(id);
          }
}

