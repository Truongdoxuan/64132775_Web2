package truongdx.baitap.SB_TruyenDuLieuSangView;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class TruyenDuLieuController {
	@GetMapping("/studentInfo")
	public String studentInfo(ModelMap model) {
		model.addAttribute("mssv", "64132775");
		model.addAttribute("name","Đỗ Xuân Trường");
		model.addAttribute("yearOb","2004");
		model.addAttribute("gtinh","Nam");
		return "studentView";	}
}
