package com.abhishek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abhishek.entities.student;
import com.abhishek.repo.StudentRepo;

@RestController
public class controller {
	  @Autowired
	    StudentRepo studentRepository;
	    //Create
	    @RequestMapping( "/student")
	    public student createStudent( )
	    {
	    	student stu=new student();
	    	stu.setId(1);
	    	stu.setName("abc");
	    	System.out.println("inside create student.....");
	        return studentRepository.save(stu);
	    }

}
