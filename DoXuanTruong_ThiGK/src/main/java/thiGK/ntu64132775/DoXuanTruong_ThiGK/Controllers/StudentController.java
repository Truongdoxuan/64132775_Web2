package thiGK.ntu64132775.DoXuanTruong_ThiGK.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import thiGK.ntu64132775.DoXuanTruong_ThiGK.Models.Student;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
	// Tạo list chứa danh sách sinh viên
    private final List<Student> dsSV = new ArrayList<>();

    @GetMapping("/home")
    public String Home(ModelMap model) {
    	model.addAttribute("content","views/home");
    	return "layout";
    }
    
    @GetMapping("/list")
    public String listStudents(ModelMap model) {
        if (dsSV.isEmpty()) { 
        	dsSV.add(new Student("001", "Nguyen Van A", "GR001"));
        	dsSV.add(new Student("002", "Tran Thi B", "GR002"));
        }
        model.addAttribute("dssv", dsSV);
        model.addAttribute("content", "views/student-list");
        return "layout";
    }
    

    @GetMapping("/addnew")
    public String newStudentForm(Model model) {
        model.addAttribute("student", new Student("", "", ""));
        model.addAttribute("content", "views/student-add");
        return "layout";
    }

    @PostMapping("/addnew")
    public String addStudent(@ModelAttribute Student student, ModelMap model) {
        if (student.getId() == null || student.getId().trim().isEmpty() ||
        	student.getName() == null || student.getName().trim().isEmpty() ||
        	student.getGroupId() == null || student.getGroupId().trim().isEmpty()) {
        	model.addAttribute("error", "Vui lòng nhập đầy đủ thông tin !");
        	model.addAttribute("content", "addnew");
        	return "layout";
        }
        dsSV.add(student);
        return "redirect:/student/list";
    }
    
    @GetMapping("/view/{id}")
    public String viewStudent(@PathVariable String id, ModelMap model) {
        Student found = dsSV.stream()
            .filter(s -> s.getId().equals(id))
            .findFirst()
            .orElse(null);
        model.addAttribute("student", found);
        model.addAttribute("content", "views/student-view");
        return "layout"; 
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable String id, ModelMap model) {
        Student found = dsSV.stream()
            .filter(s -> s.getId().equals(id))
            .findFirst()
            .orElse(null);
        if (found == null) {
            model.addAttribute("error", "Không tìm thấy sinh viên.");
            return "redirect:/list";
        }
        model.addAttribute("student", found);
        model.addAttribute("content", "views/student-edit");
        return "layout";
    }

    @PostMapping("/edit")
    public String updateStudent(@ModelAttribute Student student) {
        for (int i = 0; i < dsSV.size(); i++) {
            if (dsSV.get(i).getId().equals(student.getId())) {
                dsSV.set(i, student);
                break;
            }
        }
        return "redirect:/student/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable String id) {
        dsSV.removeIf(s -> s.getId().equals(id));
        return "redirect:/student/list";
    }
}
