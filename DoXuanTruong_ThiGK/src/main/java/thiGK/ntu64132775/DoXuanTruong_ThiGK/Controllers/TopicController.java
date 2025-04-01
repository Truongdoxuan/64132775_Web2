package thiGK.ntu64132775.DoXuanTruong_ThiGK.Controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import thiGK.ntu64132775.DoXuanTruong_ThiGK.Models.Topic;
import truongdx.baitap.TongHopGK.Models.SinhVien;

@Controller
public class TopicController {
	private final List<Topic> topics = new ArrayList<>();
	
	@GetMapping("/")
	public String Home(ModelMap model) {
		model.addAttribute("content", "Views/home");
		return "layout";
	}
	
	@GetMapping("list")
	public String StudentList(ModelMap model) {
        if (topics.isEmpty()) {
        	topics.add(new Topic(1L, "Spring Boot", "Introduction to Spring Boot", 101L, "Web"));
    		topics.add(new Topic(2L, "Machine Learning", "Basics of ML and AI", 102L, "AI"));
        }
        model.addAttribute("content", "Views/list");
        model.addAttribute("topic", topics);
        return "layout";
    }
	
	@GetMapping("/new")
	public String newTopicForm(ModelMap model) {
		model.addAttribute("topic", new Topic(0L, "", "", 0L, ""));
		model.addAttribute("content", "Views/addNew");
		return "layout";
	}
	
	@PostMapping("/add")
	public String addTopic(@ModelAttribute Topic topic) {
		topic.setId((long) (topics.size() + 1));
		topics.add(topic);
		return "layout";
	}
}
