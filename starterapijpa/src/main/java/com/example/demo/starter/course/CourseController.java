package com.example.demo.starter.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.starter.topic.TopicTO;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseservice;

	@RequestMapping(value="topics/{topicid}/courses",method=RequestMethod.GET)
	public List<CourseTO> getAllCourses(@PathVariable String topicid){
		return courseservice.getAllCourse(topicid);
	}
	
	@RequestMapping("topics/{topicid}/course/{id}")
	public CourseTO getCourse(@PathVariable String id){
		return courseservice.getCourse(id);
	}
	
	@RequestMapping(value="topics/{topicid}/courses", method=RequestMethod.POST)
	public void addCourse(@RequestBody CourseTO course, @PathVariable String topicid){
		course.setTopic(new TopicTO(topicid,"",""));
		courseservice.addCourse(course);	
	}
	
	@RequestMapping(value="topics/{topicid}/course/{id}", method=RequestMethod.PUT)
	public void updateCourse(@RequestBody CourseTO course, @PathVariable String id, @PathVariable String topicid){
		course.setTopic(new TopicTO(topicid,"",""));
		courseservice.updateCourse(course,id);	
	}
	
	@RequestMapping(value="topics/{topicid}/course/{id}", method=RequestMethod.DELETE)
	public void deleteCourse(@PathVariable String id){
		courseservice.deleteCourse(id);	
	}
	
	
	
}
