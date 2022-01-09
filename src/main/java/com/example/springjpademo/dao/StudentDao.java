package com.example.springjpademo.dao;

import com.example.springjpademo.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<Student,Long> {

}
