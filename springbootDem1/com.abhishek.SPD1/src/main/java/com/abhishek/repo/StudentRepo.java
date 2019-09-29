package com.abhishek.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.abhishek.entities.student;

@Repository
public interface StudentRepo extends CrudRepository<student, Long> {

}
