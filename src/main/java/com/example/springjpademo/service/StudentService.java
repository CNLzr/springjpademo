package com.example.springjpademo.service;

import com.example.springjpademo.dao.StudentDao;
import com.example.springjpademo.model.Student;
import com.example.springjpademo.exceptions.StudentNonExistIdException;
import com.example.springjpademo.exceptions.StudentEmptyNameException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    StudentDao studentDao;

    @Autowired
    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }


    public List<Student> getAllStudents(){
        return (List<Student>) studentDao.findAll();
    }

    public Optional<Student> getStudentById(Long id){
        return studentDao.findById(id);
    }

    public Student addStudent(Student student){
        if(student.getName().isEmpty()){
            throw new StudentEmptyNameException("Student name cannot be empty.");
        }
        return studentDao.save(student);
    }

    public Student updateStudent(Student student){
        if(student.getId() == null || !studentDao.existsById(student.getId())){
            throw new StudentNonExistIdException("Student id cannot be empty.");
        }
        return studentDao.save(student);
    }



}
