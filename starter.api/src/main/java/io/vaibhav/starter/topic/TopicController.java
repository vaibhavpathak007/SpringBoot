package io.vaibhav.starter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicservice;

	@RequestMapping(value="/topics",method=RequestMethod.GET)
	public List<TopicTO> getAllTopics(){
	
		return topicservice.getAllTopics();
		
	}
	
	@RequestMapping("/topics/{id}")
	public TopicTO getTopic(@PathVariable String id){
		return topicservice.getTopic(id);
	}
	
	@RequestMapping(value="/topics", method=RequestMethod.POST)
	public void addTopic(@RequestBody TopicTO topic){
		topicservice.addTopic(topic);	
	}
	
	@RequestMapping(value="/topics/{id}", method=RequestMethod.PUT)
	public void updateTopic(@RequestBody TopicTO topic, @PathVariable String id){
		topicservice.updateTopic(topic,id);	
	}
	
	@RequestMapping(value="/topics/{id}", method=RequestMethod.DELETE)
	public void deleteTopic(@PathVariable String id){
		topicservice.deleteTopic(id);	
	}
	
	
	
}
