package com.example.springjpademo.controller;

import com.example.springjpademo.service.UniversityClassService;
import org.springframework.beans.factory.annotation.Autowired;

public class UniversityClassController {

    UniversityClassService universityClassService;

    @Autowired
    public UniversityClassController(UniversityClassService universityClassService) {
        this.universityClassService = universityClassService;
    }
}
