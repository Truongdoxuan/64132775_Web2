package truongdx.baitap.TongHopGK.Controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import truongdx.baitap.TongHopGK.Models.SinhVien;

@Controller
public class HomeController {
	private final ArrayList<SinhVien> dsSV = new ArrayList<SinhVien>();
	@GetMapping("/about")
	public String AboutStudent(ModelMap model) {
		model.addAttribute("mssv", "64132775");
		model.addAttribute("hoten", "Đỗ Xuân Trường");
		model.addAttribute("yearOb","2004");
		model.addAttribute("gtinh","Nam");
		return "Views/About";
	}
	
	@GetMapping("/")
	public String StudentList(ModelMap model) {
		dsSV.add(new SinhVien("64132775", "Đỗ Xuân Trường", 8.0));
		dsSV.add(new SinhVien("64132776", "Nguyễn Văn An", 7.2));
		dsSV.add(new SinhVien("64132777", "Trần Thị Bích", 6.3));
		dsSV.add(new SinhVien("64132778", "Nguyễn Xuân Chương", 7.7));
		dsSV.add(new SinhVien("64132779", "Bùi Công Dương", 9.5));
		model.addAttribute("dssv",dsSV);
		return "Views/List";
	}
	
	@GetMapping("/home")
	public String Home(ModelMap model) {
		return "Views/Home";
	}
	
	@GetMapping("/addnew")
	public String FormAddNew(ModelMap model) {
		model.addAttribute("sv", new SinhVien("", "", null));
		model.addAttribute("dssv", dsSV);
		return "View/AddNew";
	}
	
	@PostMapping("/addnew")
	public String AddSinhVien(@ModelAttribute SinhVien sv, ModelMap model) {
	    dsSV.add(sv);
	    model.addAttribute("dssv", dsSV);
	    return "Views/List";
	}
}
	
