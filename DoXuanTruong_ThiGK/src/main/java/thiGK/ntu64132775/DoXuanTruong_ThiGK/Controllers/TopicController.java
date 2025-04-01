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
    private final List<Topic> topics = new ArrayList<>();

    @GetMapping("/list")
    public String listTopics(ModelMap model) {
        if (topics.isEmpty()) {
            topics.add(new Topic(1L, "Spring Boot", "Intro to Spring Boot", 101L, "Web"));
            topics.add(new Topic(2L, "Machine Learning", "Basics of ML", 102L, "AI"));
        }
        model.addAttribute("topics", topics);
        model.addAttribute("content", "views/topic-list");
        return "layout";
    }

    @GetMapping("/new")
    public String newTopicForm(ModelMap model) {
        model.addAttribute("topic", new Topic(0L, "", "", 0L, ""));
        model.addAttribute("content", "views/topic-add");
        return "layout";
    }

    @PostMapping("/add")
    public String addTopic(@ModelAttribute Topic topic) {
        topic.setId((long) (topics.size() + 1));
        topics.add(topic);
        return "redirect:/topic/list";
    }

    @GetMapping("/view/{id}")
    public String viewTopic(@PathVariable Long id, ModelMap model) {
        topics.stream().filter(t -> t.getId().equals(id)).findFirst().ifPresent(t -> model.addAttribute("topic", t));
        model.addAttribute("content", "views/topic-view");
        return "layout";
    }
}
