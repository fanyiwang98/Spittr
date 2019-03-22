package blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author: wyf
 * @date: Created on 2019/3/21
 * @description:
 */
@Controller
public class FileUploadController {
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public String upload(@RequestParam("values") MultipartFile file) throws IOException {

        if (file != null) {
            String name = file.getOriginalFilename();
            System.out.println(name);
            file.transferTo(new File("C:\\Users\\12419\\Desktop\\Spittr\\" + name));
        }
        return "ok";
    }
}
