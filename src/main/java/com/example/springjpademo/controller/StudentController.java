package com.example.springjpademo.controller;

import com.example.springjpademo.exceptions.StudentEmptyNameException;
import com.example.springjpademo.exceptions.StudentNonExistIdException;
import com.example.springjpademo.model.Student;
import com.example.springjpademo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/student")
public class StudentController {

    StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAllStudent(){
        return studentService.getAllStudents();
    }

    @RequestMapping("/register")
    @PostMapping
    public ResponseEntity<String> registerStudent(@RequestBody Student student){
        try {
            Student savedStudent = studentService.addStudent(student);
            return ResponseEntity.ok("Registered Student. " + student.toString());
        }catch(StudentEmptyNameException e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

}
