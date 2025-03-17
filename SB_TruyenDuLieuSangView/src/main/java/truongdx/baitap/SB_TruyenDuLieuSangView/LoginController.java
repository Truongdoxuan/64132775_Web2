package truongdx.baitap.SB_TruyenDuLieuSangView;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(ModelMap model, HttpServletRequest request) {
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		if(id.equals("64132775") && pass.equals("dxt2004")) {
			model.addAttribute("message", "Đăng nhập thành công");
			return "redirect:/studentProfile";
		}
		else {
			model.addAttribute("mesage", "Id hoặc mật khẩu không đúng");
		}
		return "login";
	}
}
