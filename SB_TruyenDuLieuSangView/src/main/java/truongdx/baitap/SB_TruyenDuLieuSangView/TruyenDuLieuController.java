package truongdx.baitap.SB_TruyenDuLieuSangView;

import java.time.LocalDate;
import java.util.ArrayList;

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
	
	@GetMapping("/dssinhvien")
	public String StudentList(ModelMap model) {
		ArrayList<SinhVien> dsSVien;
		dsSVien = new ArrayList<SinhVien>();
		dsSVien.add(new SinhVien("64132775", "Đỗ", "Xuân Trường", "Nam", LocalDate.of(2004, 1, 8), "Nha Trang"));
		dsSVien.add(new SinhVien("64132776", "Nguyễn", "Văn An", "Nam", LocalDate.of(2003, 2, 15), "Hà Nội"));
		dsSVien.add(new SinhVien("64132777", "Trần", "Thị Bích", "Nữ", LocalDate.of(2004, 3, 12), "Đà Nẵng"));
		dsSVien.add(new SinhVien("64132778", "Phạm", "Văn Cường", "Nam", LocalDate.of(2002, 6, 20), "Hải Phòng"));
		dsSVien.add(new SinhVien("64132779", "Lê", "Thị Dâng", "Nữ", LocalDate.of(2003, 8, 9), "Hồ Chí Minh"));
		dsSVien.add(new SinhVien("64132780", "Hoàng", "Thanh Nam", "Nam", LocalDate.of(2004, 11, 25), "Cần Thơ"));
		dsSVien.add(new SinhVien("64132781", "Vũ", "Minh Tâm", "Nữ", LocalDate.of(2003, 4, 5), "Quảng Ninh"));
		dsSVien.add(new SinhVien("64132782", "Đặng", "Ngọc Giang", "Nam", LocalDate.of(2002, 9, 18), "Huế"));
		dsSVien.add(new SinhVien("64132783", "Bùi", "Phương Hà", "Nữ", LocalDate.of(2004, 12, 3), "Bình Dương"));
		dsSVien.add(new SinhVien("64132784", "Đỗ", "Quang Minh", "Nam", LocalDate.of(2003, 7, 22), "Nha Trang"));
		model.addAttribute("ds", dsSVien);
		return "dsSinhvienView";
	}
}
