package com.example.springjpademo.service;

import com.example.springjpademo.dao.UniversityClassDao;
import com.example.springjpademo.model.UniversityClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UniversityClassService {
    UniversityClassDao universityClassDao;

    @Autowired
    public UniversityClassService(UniversityClassDao universityClassDao) {
        this.universityClassDao = universityClassDao;
    }

    public List<UniversityClass> getAllClass(){
        return (List<UniversityClass>) universityClassDao.findAll();
    }

    public Optional<UniversityClass> getUniversityClassById(Long id){
        return universityClassDao.findById(id);
    }



}
