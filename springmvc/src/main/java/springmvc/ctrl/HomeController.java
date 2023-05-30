package springmvc.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

@RequestMapping(value = "/home")
public String myMethod(Model m) {
    // do something
    String str = "Wiley";
    m.addAttribute("name", str);
    return "home";
}
}

