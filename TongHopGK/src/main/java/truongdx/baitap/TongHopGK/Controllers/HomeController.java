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
    private final ArrayList<SinhVien> dsSV = new ArrayList<>();

    @GetMapping("/")
    public String Home(ModelMap model) {
        model.addAttribute("content", "views/home");
        return "layout";
    }

    @GetMapping("/about")
    public String AboutStudent(ModelMap model) {
        model.addAttribute("content", "views/about");
        model.addAttribute("mssv", "64132775");
        model.addAttribute("hoten", "Đỗ Xuân Trường");
        model.addAttribute("yearOb", "2004");
        model.addAttribute("gtinh", "Nam");
        return "layout"; // Đổi thành layout để giữ nguyên header/footer
    }

    @GetMapping("/list")
    public String StudentList(ModelMap model) {
        if (dsSV.isEmpty()) { // Chỉ thêm một lần
            dsSV.add(new SinhVien("64132775", "Đỗ Xuân Trường", 8.0));
            dsSV.add(new SinhVien("64132776", "Nguyễn Văn An", 7.2));
            dsSV.add(new SinhVien("64132777", "Trần Thị Bích", 6.3));
            dsSV.add(new SinhVien("64132778", "Nguyễn Xuân Chương", 7.7));
            dsSV.add(new SinhVien("64132779", "Bùi Công Dương", 9.5));
        }
        model.addAttribute("content", "views/list");
        model.addAttribute("dssv", dsSV);
        return "layout";
    }

    @GetMapping("/addnew")
    public String FormAddNew(ModelMap model) {
        model.addAttribute("sv", new SinhVien("", "", null));
        model.addAttribute("content", "views/addnew");
        return "layout";
    }

    @PostMapping("/addnew")
    public String AddSinhVien(@ModelAttribute SinhVien sv, ModelMap model) {
        if (sv.getMssv() == null || sv.getMssv().trim().isEmpty() || 
            sv.getHotensv() == null || sv.getHotensv().trim().isEmpty() || 
            sv.getDiemTB() == null) {
            model.addAttribute("error", "Vui lòng nhập đầy đủ thông tin!");
            model.addAttribute("content", "views/addnew");
            return "layout";
        }

        dsSV.add(sv);
        return "redirect:/list"; // Chuyển hướng để tránh gửi lại form
    }
}
