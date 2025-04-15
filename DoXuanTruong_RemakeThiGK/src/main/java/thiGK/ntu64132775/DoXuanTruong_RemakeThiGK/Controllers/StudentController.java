package thiGK.ntu64132775.DoXuanTruong_RemakeThiGK.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import thiGK.ntu64132775.DoXuanTruong_RemakeThiGK.Models.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	private final List<Student> dsSV = new ArrayList<>();
    
    @GetMapping("/all")
    public String listStudents(ModelMap model) {
        if (dsSV.isEmpty()) { 
        	dsSV.add(new Student("001", "Nguyen Van A", "GR001"));
        	dsSV.add(new Student("002", "Tran Thi B", "GR002"));
        	dsSV.add(new Student("003", "Bui Van C", "GR003"));
        }
        model.addAttribute("dssv", dsSV);
        model.addAttribute("content", "views/student/listSV");
        return "layout";
    }
    

    @GetMapping("/new")
    public String newStudentForm(Model model) {
        model.addAttribute("student", new Student("", "", ""));
        model.addAttribute("content", "views/student/addSV");
        return "layout";
    }

    @PostMapping("/new")
    public String addStudent(@ModelAttribute Student student, ModelMap model) {
        if (student.getId() == null || student.getId().trim().isEmpty() ||
        	student.getName() == null || student.getName().trim().isEmpty() ||
        	student.getGroupId() == null || student.getGroupId().trim().isEmpty()) {
        	model.addAttribute("error", "Vui lòng nhập đầy đủ thông tin !");
        	model.addAttribute("content", "addnew");
        	return "layout";
        }
        dsSV.add(student);
        return "redirect:/student/listSV";
    }
    
    @GetMapping("/view/{id}")
    public String viewStudent(@PathVariable String id, ModelMap model) {
        Student found = dsSV.stream()
            .filter(s -> s.getId().equals(id))
            .findFirst()
            .orElse(null);
        model.addAttribute("student", found);
        model.addAttribute("content", "views/student/viewSV");
        return "layout"; 
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable String id) {
        dsSV.removeIf(s -> s.getId().equals(id));
        return "redirect:/student/listSV";
    }
}
