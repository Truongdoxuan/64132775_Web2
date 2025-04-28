package vn.truongdx.Example_ConnectMySQL.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import vn.truongdx.Example_ConnectMySQL.Repositories.ISanPham;

@Controller
public class SanPhamController {
	@Autowired
	private ISanPham sanpham;
	
	@GetMapping("/sanpham")
	public String printSanPhamList(ModelMap model) {
		model.addAttribute("sp", sanpham.findAll());
		return "sanphamList";
	}
}