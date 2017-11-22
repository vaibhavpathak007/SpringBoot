package com.example.demo.starter.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.example.demo.starter.topic.TopicTO;

@Entity
public class CourseTO {
	
	@Id
	private String id;
	private String name;
	private String description;
	
	@ManyToOne
	TopicTO topic;
	
	public CourseTO(){
		
	}
	
	public CourseTO(String id, String name, String description, String topicid) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic = new TopicTO(topicid, "", "");
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public TopicTO getTopic() {
		return topic;
	}

	public void setTopic(TopicTO topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return "CourseTO [id=" + id + ", name=" + name + ", description=" + description + ", topic=" + topic + "]";
	}

}
