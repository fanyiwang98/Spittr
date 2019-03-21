package blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.peer.SystemTrayPeer;
import java.io.File;
import java.io.IOException;

/**
 * @author: wyf
 * @date: Created on 2019/3/21
 * @description:
 */
@Controller
public class FileUploadController {
    @PostMapping("upload")
    public String upload(@RequestParam("values") MultipartFile file) throws IOException {

        if (file != null) {
            String name = file.getOriginalFilename();
            System.out.println(name);
            file.transferTo(new File("C:\\Users\\12419\\Desktop\\Spittr\\data\\" + name));
        }
        return "ok";
    }
}
