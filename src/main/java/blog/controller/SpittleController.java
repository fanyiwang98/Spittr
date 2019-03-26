package blog.controller;

import blog.dao.SpittleDao;
import blog.entity.Spittle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: wyf
 * @date: Created on 2019/3/21
 * @description:
 */
@Controller
public class SpittleController {
    @Autowired
    private SpittleDao spittleDao;

    @RequestMapping(value = "/spittle/add", method = RequestMethod.POST)
    @ResponseBody
    public String add(@RequestBody Spittle spittle) {
        spittleDao.add(spittle);

        return "ok";
    }

    @RequestMapping(value = "spittle/get", method = RequestMethod.GET)
    @ResponseBody
    public Spittle get(@RequestParam("id") Long id) {
        Spittle spittle = spittleDao.get(id);
        return spittle;
    }

    @RequestMapping(value = "spittle/getHQL", method = RequestMethod.GET)
    @ResponseBody
    public List<Spittle> getHQL(@RequestParam("message") String message) {
        List<Spittle> spittles = spittleDao.getHQL(message);
        return spittles;
    }

    @RequestMapping(value = "spittle/getCriteria", method = RequestMethod.GET)
    @ResponseBody
    public List<Spittle> getCriteria(@RequestParam("message") String message) {
        List<Spittle> spittles = spittleDao.getCriteria(message);
        return spittles;
    }
}
