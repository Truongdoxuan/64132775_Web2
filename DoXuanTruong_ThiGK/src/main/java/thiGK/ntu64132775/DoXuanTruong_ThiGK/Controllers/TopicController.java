package thiGK.ntu64132775.DoXuanTruong_ThiGK.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import thiGK.ntu64132775.DoXuanTruong_ThiGK.Models.Topic;

@Controller
@RequestMapping("/topic")
public class TopicController {
	private final List<Topic> dsTopic = new ArrayList<>();
	
	@GetMapping("/all")
    public String listTopic(ModelMap model) {
        if (dsTopic.isEmpty()) {
        	dsTopic.add(new Topic("TP001", "Spring Boot","Started about SP", "SP001","Infomation Technology"));
        	dsTopic.add(new Topic("TP002", "Java Script", "Learning JS to zero from hero","SP002","Infomation Technology"));
        }
        model.addAttribute("dstp", dsTopic);
        model.addAttribute("content", "views/topic-list");
        return "layout";
    }
	
	@GetMapping("/addnew")
    public String formTopic(ModelMap model) {
        model.addAttribute("topic", new Topic("","","","",""));
        model.addAttribute("content", "views/topic-add");
        return "layout";
    }
	
	@PostMapping("/addnew")
    public String addTopic(@ModelAttribute Topic tp, ModelMap model) {
        dsTopic.add(tp);
        return "redirect:/topic/all";
    }
}
