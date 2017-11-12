package io.vaibhav.starter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<TopicTO> getAllTopics(){
		
		return Arrays.asList( new TopicTO("spring", "spring framework", "spring framework description"),
				 new TopicTO("java", "core java", "core java description"),
				 new TopicTO("javascript", "javascript", "javascript descrition")
				 );
		
	}
	
}
