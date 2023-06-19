package io.puneet.springboot.topiccontroller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class topicService {
	
	private  List<topics> topic= new ArrayList<>(Arrays.asList(
				new topics("spring", "spring boot ", "mvc"),
				new topics("java", "spring core ", "jdbc"),
				new topics("core", "advance ", "Swing")
				));
	
	public List<topics> getAlltopics(){
		return topic;
	}
	
  public topics getTopicById(String id) {
	  
	// get all topics and filter with lamda
	 return  topic.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	 
  }

   public void addTopic(topics tP) {
	   topic.add(tP);
	
	
  }

 
   public void updateTopic(topics tP, String id) {
	for (int i = 0; i < topic.size(); i++) {
		topics t=topic.get(i);
		 if(t.getId().equals(id)) {
			 topic.set(i, tP);
			 return; 
		 }
		
	}
	
   }

    public void getDelete(String id) {
	
	for (int i = 0; i < topic.size(); i++) {
		  topics t=topic.get(i);
		   if (t.getId().equals(id)) {
			   topic.remove(i);
		   }
		
	}
	
   }
	
	
}
