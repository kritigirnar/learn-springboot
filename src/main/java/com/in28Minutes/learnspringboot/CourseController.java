package com.in28Minutes.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> retrieveCourses()
	{
		return Arrays.asList(
				new Course(1,"Learn AWS","in28Minutes"),
				new Course(2,"Learn Docker","in28Minutes" )
				);
	}
	
}
