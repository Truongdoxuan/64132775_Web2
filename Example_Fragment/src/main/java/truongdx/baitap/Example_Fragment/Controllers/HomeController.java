package truongdx.baitap.Example_Fragment.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String Home() {
		return "Views/home";
	}
	
	@GetMapping("about")
	public String About() {
		return "Views/about";
	}
}
