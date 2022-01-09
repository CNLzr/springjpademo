package com.example.springjpademo.dao;

import com.example.springjpademo.model.UniversityClass;
import org.springframework.data.repository.CrudRepository;

public interface UniversityClassDao extends CrudRepository<UniversityClass,Long> {
}
