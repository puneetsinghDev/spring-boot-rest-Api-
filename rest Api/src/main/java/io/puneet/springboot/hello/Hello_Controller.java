package io.puneet.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello_Controller {
	
	@RequestMapping("/hello")
	 public  String SayHello() {
		 
		 
		return "hello"; 
	 }

}
