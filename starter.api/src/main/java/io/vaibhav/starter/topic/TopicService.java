package io.vaibhav.starter.topic;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<TopicTO> topics = Arrays.asList( new TopicTO("spring", "spring framework", "spring framework description"),
			 new TopicTO("java", "core java", "core java description"),
			 new TopicTO("javascript", "javascript", "javascript descrition")
			 );
	
	public List<TopicTO> getAllTopics(){
		
		return topics;
	}
	
	public TopicTO getTopic(String id){
		
		for(TopicTO t : topics){
			if(t.getId().equals(id)){
				return t;
			}
		}
		return null;
	}
	

}
