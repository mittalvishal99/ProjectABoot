package io.mittal.first.projectA.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController 
{
	@RequestMapping("/topic")
	public String getalltopics()
	{
		return "data";
	}

}
