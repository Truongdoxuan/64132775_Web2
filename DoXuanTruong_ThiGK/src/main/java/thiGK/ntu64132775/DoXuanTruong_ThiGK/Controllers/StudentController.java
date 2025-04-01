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
    private List<Student> students = new ArrayList<>();

    public StudentController() {
        students.add(new Student(1L, "Nguyen Van A", 101L));
        students.add(new Student(2L, "Tran Thi B", 102L));
    }

    @GetMapping("/list")
    public String listStudents(Model model) {
        model.addAttribute("students", students);
        return "student-list";
    }

    @GetMapping("/new")
    public String newStudentForm(Model model) {
        model.addAttribute("student", new Student(0L, "", 0L));
        return "student-form";
    }

    @PostMapping("/add")
    public String addStudent(@ModelAttribute Student student) {
        student.setId((long) (students.size() + 1));
        students.add(student);
        return "redirect:/student/list";
    }
}

