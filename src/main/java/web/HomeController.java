package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * @author: wyf
 * @date: Created on 2019/3/20
 * @description:
 */
@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home() {
        System.out.println("visit home");
        return "home";
    }
}
