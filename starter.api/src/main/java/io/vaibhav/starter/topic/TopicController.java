package io.vaibhav.starter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicservice;

	@RequestMapping("/topics")
	public List<TopicTO> getAllTopics(){
	
		return topicservice.getAllTopics();
		
	}
	
	@RequestMapping("/topics/{id}")
	public TopicTO getTopic(@PathVariable String id){
		
		return topicservice.getTopic(id);
		
	}
	
}
