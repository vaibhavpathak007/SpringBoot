package com.example.demo.starter.course;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<CourseTO, String>  {

	public ArrayList<CourseTO> findByTopicId(String topicid);
	
}
