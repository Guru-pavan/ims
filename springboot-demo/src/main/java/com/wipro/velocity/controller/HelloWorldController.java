package com.wipro.velocity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@RestController
@Controller
public class HelloWorldController {
	
	//Executed with Rest controller annotation--> http://localhost:8080/hello
	@GetMapping("/hello")
    public String sayHello()
    {
        return "Hello World from Spring Boot";
    }
	
	//Mapping for root  http://localhost:9090
	   @GetMapping("/")
       public String index() {
          return "index";//return index.jsp
       }
      
       @PostMapping("/test")
       public String sayHello(@RequestParam("name") String name, Model model) {
          model.addAttribute("name", name);
          return "hello";//returns model(data)+view
       }
}