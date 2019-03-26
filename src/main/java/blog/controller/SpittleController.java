package blog.controller;

import blog.dao.SpittleDao;
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
        System.out.println(spittle.getLatitude());

        SpittleDao spittleDao = new SpittleDao();
        spittleDao.add(spittle);

        return "ok";
    }
}
