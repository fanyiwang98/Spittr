package blog.controller;

import blog.config.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: wyf
 * @date: Created on 2019/3/20
 * @description:
 */
@Controller
public class HomeController {
    @RequestMapping("/home")
    @ResponseBody
    public Result home() {
        System.out.println("visit home");
        return Result.Success();
    }
}
