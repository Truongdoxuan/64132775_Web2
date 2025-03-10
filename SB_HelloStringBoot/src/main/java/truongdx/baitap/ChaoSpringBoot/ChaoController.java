package truongdx.baitap.ChaoSpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChaoController {
	@GetMapping("/")
	public String xin_Chao(ModelMap model) {
		model.addAttribute("tb","Hello");
		return "helloView";
	}	
}
