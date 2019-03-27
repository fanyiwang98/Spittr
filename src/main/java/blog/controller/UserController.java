package blog.controller;

import blog.dao.SpittleDao;
import blog.dao.UserDao;
import blog.entity.Spittle;
import blog.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Set;

/**
 * @author: wyf
 * @date: Created on 2019/3/26
 * @description:
 */
@Controller
public class UserController {
    @Autowired
    private UserDao userDao;
    @Autowired
    private SpittleDao spittleDao;

    @RequestMapping(value = "user/list", method = RequestMethod.GET)
    @ResponseBody
    public User list(@RequestParam("id") Long id) {
        User user = userDao.list(id);
        System.out.println(user);
        //Set<Spittle> spittles = spittleDao.getByUserId(id);
        //user.setSpittleList(spittles);
        return user;
    }
}
