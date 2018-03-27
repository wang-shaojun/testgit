package cn.vpclub.graduation.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping(value="/web")
    public String testWebGL(){
        return "webgl";
    }

}
