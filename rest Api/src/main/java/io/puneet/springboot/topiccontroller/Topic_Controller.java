package io.puneet.springboot.topiccontroller;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Topic_Controller {
	
	@Autowired
	private topicService TP_Service;
	
	@RequestMapping("/topics")
	public List<topics> getAlltopics() {
		// we can return here also .
		return  TP_Service.getAlltopics();
		
	}
	
	@RequestMapping("/topics/{id}")
	public topics getTopicById( @PathVariable String id) {
		return TP_Service.getTopicById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	 public void addTopic(@RequestBody topics TP) {
		TP_Service.addTopic(TP);
		
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
	 public void updateTopic(@RequestBody topics TP,  @PathVariable String id) {
		TP_Service.updateTopic(TP,id);
		
	}
	
	
	@RequestMapping(method = RequestMethod.DELETE, value="/topics/{id}")
	public void getDelete( @PathVariable String id) {
		 TP_Service.getDelete(id);
	}
	

}
