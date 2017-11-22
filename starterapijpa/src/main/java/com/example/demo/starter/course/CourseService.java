package com.example.demo.starter.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	

	
	public List<CourseTO> getAllCourse(String topicid){
		
		
		return courseRepository.findByTopicId(topicid);
		/*ArrayList<CourseTO> courses = new ArrayList<CourseTO>();
		courseRepository.findAll().forEach(courses::add);
		return courses;*/
	}
	
	public CourseTO getCourse(String id){
		
		return courseRepository.findOne(id);
	}

	public void addCourse(CourseTO course) {
		
		courseRepository.save(course);
	}

	public void updateCourse(CourseTO course, String id) {
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		courseRepository.delete(id);
	}
	

}
