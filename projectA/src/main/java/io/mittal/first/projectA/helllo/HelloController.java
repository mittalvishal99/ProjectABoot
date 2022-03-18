package io.mittal.first.projectA.helllo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{
	@RequestMapping("/hello")  //only for get mapping
	
	public String sayHi()
	{
		return "Hi";
	}

}
