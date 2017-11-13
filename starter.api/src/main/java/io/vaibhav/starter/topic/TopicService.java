package io.vaibhav.starter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<TopicTO> topics = new ArrayList<TopicTO>(Arrays.asList( new TopicTO("spring", "spring framework", "spring framework description"),
			 new TopicTO("java", "core java", "core java description"),
			 new TopicTO("javascript", "javascript", "javascript descrition")
			 ));
	
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

	public void addTopic(TopicTO topic) {
		
		topics.add(topic);
		
	}

	public void updateTopic(TopicTO topic, String id) {
	 for(TopicTO mytopic: topics){
		 if(mytopic.getId().equals(id)){
			 mytopic.setId(topic.getId());
			 mytopic.setName(topic.getName());
			 mytopic.setDescription(topic.getDescription());
			 return;
		 }
	 }
		
	}

	public void deleteTopic(String id) {
		
		for(int i=0; i<topics.size(); i++){
			TopicTO tt = topics.get(i);
			if(tt.getId().equals(id)){
				topics.remove(i);
				return;
			}
		}
		
	}
	

}
