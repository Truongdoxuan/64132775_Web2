package thiGK.ntu64132775.DoXuanTruong_ThiGK.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import thiGK.ntu64132775.DoXuanTruong_ThiGK.Models.Student;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    private final List<Student> students = new ArrayList<>();

    @GetMapping("/list")
    public String listStudents(Model model) {
        if (students.isEmpty()) {
            students.add(new Student(1L, "Nguyen Van A", 101L));
            students.add(new Student(2L, "Tran Thi B", 102L));
        }
        model.addAttribute("students", students);
        model.addAttribute("content", "views/student-list");
        return "layout";
    }

    @GetMapping("/new")
    public String newStudentForm(Model model) {
        model.addAttribute("student", new Student(0L, "", 0L));
        model.addAttribute("content", "views/student-add");
        return "layout";
    }

    @PostMapping("/add")
    public String addStudent(@ModelAttribute Student student) {
        student.setId((long) (students.size() + 1));
        students.add(student);
        return "redirect:/student/list";
    }

    @GetMapping("/view/{id}")
    public String viewStudent(@PathVariable Long id, Model model) {
        students.stream().filter(s -> s.getId().equals(id)).findFirst().ifPresent(s -> model.addAttribute("student", s));
        model.addAttribute("content", "views/student-view");
        return "layout";
    }
}
