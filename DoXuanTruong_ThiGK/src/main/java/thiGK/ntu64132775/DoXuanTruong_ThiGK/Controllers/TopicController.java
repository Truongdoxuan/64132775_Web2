package thiGK.ntu64132775.DoXuanTruong_ThiGK.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;

import thiGK.ntu64132775.DoXuanTruong_ThiGK.Models.Topic;

@Controller
public class TopicController {
	private List<Topic> topics = new ArrayList<>();
	
	public TopicController() {
		topics.add(new Topic(1, "Spring Boot", "Introduction to Spring Boot", 001, "Web"));
		topics.add(new Topic(2, "Machine Learning", "Basics of ML and AI", 002, "AI"));
	}
	
}
