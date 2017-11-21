package com.example.demo.starter.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	

	
	public List<TopicTO> getAllTopics(){
		
		ArrayList<TopicTO> topics = new ArrayList<TopicTO>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public TopicTO getTopic(String id){
		
		return topicRepository.findOne(id);
	}

	public void addTopic(TopicTO topic) {
		
		topicRepository.save(topic);
	}

	public void updateTopic(TopicTO topic, String id) {
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		topicRepository.delete(id);
	}
	

}
