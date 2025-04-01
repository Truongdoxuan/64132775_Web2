package thiGK.ntu64132775.DoXuanTruong_ThiGK.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import thiGK.ntu64132775.DoXuanTruong_ThiGK.Models.Topic;

@Controller
public class TopicController {
	private List<Topic> topics = new ArrayList<>();
	
	public TopicController() {
		topics.add(new Topic(1L, "Spring Boot", "Introduction to Spring Boot", 101L, "Web"));
		topics.add(new Topic(2L, "Machine Learning", "Basics of ML and AI", 102L, "AI"));
	}
	
	@GetMapping("/list")
	public String listTopic(ModelMap model) {
		model.addAttribute("topics", topics);
		return "topic_list";
	}
	
	@GetMapping("/new")
	public String newTopicForm(ModelMap model) {
		model.addAttribute("topic", new Topic(0L, "", "", 0L, ""));
		return "topic_form";
	}
	
	@PostMapping("/add")
	public String 
}
