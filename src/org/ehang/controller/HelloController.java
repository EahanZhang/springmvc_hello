package org.ehang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created By sunshine on 2018/8/14
 */

@Controller
public class HelloController {

    // RequestMapping注解用于确定对应该函数的url
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("Hello");
        return "hello";
    }

    // 使用Model对象来向View传值，使用RequestParam来接收必须需要的值，
    @RequestMapping("/welcome")
    public String welcome(String username, Model model) {
        System.out.println("welcome");
        model.addAttribute("username", username);
        return "welcome";
    }
}
