package thymeleafform;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ThymeleafController {

    @RequestMapping(value="/thymeleaf", method= RequestMethod.GET)
    public String thymeleafForm(Model model) {
        model.addAttribute("thymeleaf", new Thymeleaf());
        return "thymeleaf";
    }

    @RequestMapping(value="/thymeleaf", method=RequestMethod.POST)
    public String thymeleafSubmit(@ModelAttribute Thymeleaf thymeleaf, Model model) {
        model.addAttribute("thymeleaf", thymeleaf);
        return "result";
    }

}
