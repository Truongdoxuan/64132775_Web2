package thiGK.ntu64132775.DoXuanTruong_RemakeThiGK.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import thiGK.ntu64132775.DoXuanTruong_RemakeThiGK.Models.Student;
import thiGK.ntu64132775.DoXuanTruong_RemakeThiGK.Models.Topic;

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
        model.addAttribute("content", "views/topic/listTP");
        return "layout";
    }
	
	@GetMapping("/new")
    public String formTopic(ModelMap model) {
        model.addAttribute("topic", new Topic("","","","",""));
        model.addAttribute("content", "views/topic/addTP");
        return "layout";
    }
	
	@PostMapping("/new")
    public String addTopic(@ModelAttribute Topic tp, ModelMap model) {
        dsTopic.add(tp);
        return "redirect:/topic/all";
    }
	
	 @GetMapping("/view/{id}")
	    public String viewTopic(@PathVariable String id, ModelMap model) {
	        Topic found = dsTopic.stream()
	            .filter(s -> s.getId().equals(id))
	            .findFirst()
	            .orElse(null);
	        model.addAttribute("topic", found);
	        model.addAttribute("content", "views/topic/viewTP");
	        return "layout"; 
	    }
	 
	@GetMapping("/delete/{id}")
    public String deleteTopic(@PathVariable String id) {
        dsTopic.removeIf(s -> s.getId().equals(id));
        return "redirect:/topic/all";
    }
}
