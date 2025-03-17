package truongdx.baitap.SB_BMI;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BMI_Controller {

    @GetMapping("/bmi")
    public String BMI_Form() {
        return "bmi";
    }

    @PostMapping("/bmi")
    public String tinhBMI(ModelMap model,
                          @RequestParam("chieucao") String heightStr,
                          @RequestParam("cannang") String weightStr) {
        try {
            float cannang = Float.parseFloat(weightStr);
            float chieucao = Float.parseFloat(heightStr) / 100;

            if (chieucao <= 0 || cannang <= 0) {
                model.addAttribute("message", "Vui lòng nhập số hợp lệ.");
                return "bmi";
            }

            float bmi = cannang / (chieucao * chieucao);
            String comment;

            if (bmi < 18.5) {
                comment = "Bạn gầy";
            } else if (bmi < 23) {
                comment = "Bạn bình thường";
            } else if (bmi < 25) {
                comment = "Bạn thừa cân";
            } else {
                comment = "Bạn béo phì";
            }

            model.addAttribute("bmi", String.format("%.1f", bmi)); 
            model.addAttribute("comment", comment);
            return "result";

        } catch (NumberFormatException e) {
            model.addAttribute("message", "Vui lòng nhập số hợp lệ.");
            return "bmi";
        }
    }
}
