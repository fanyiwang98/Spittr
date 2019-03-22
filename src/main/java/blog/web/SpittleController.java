package blog.web;

import blog.entity.Spittle;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: wyf
 * @date: Created on 2019/3/21
 * @description:
 */
@Controller
public class SpittleController {
    @RequestMapping(value = "/spittle", method = RequestMethod.POST)
    @ResponseBody
    public String show(@RequestBody Spittle spittle) {
        if (spittle == null)
            System.out.println("null");
        else
            System.out.println(spittle.getId() + spittle.getLatitude() + spittle.getLongtitude());
        return "ok";
    }
}
