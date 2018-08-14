package org.ehang.controller;

import org.ehang.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;

/**
 * Created By sunshine on 2018/8/14
 */

@Controller
@RequestMapping("/user")
public class UserController {

    private Map<String, User> users = new HashMap<>();

    public UserController() {
        users.put("zyh", new User("zyh", "123", "ehang", "yhzhang@gmail.com"));
        users.put("yyf", new User("yyf", "123", "feng", "feng@gmail.com"));
        users.put("pt", new User("pt", "123", "tian", "tian@gmail.com"));
        users.put("pis", new User("pis", "123", "yaphet", "yaphet@gmail.com"));
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("users", users);
        return "user/list";
    }

    // 使用Get请求访问Add页面时会访问该函数
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute(new User());
        return "user/add";
    }

    // 使用POST请求添加用户时，会访问该函数
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(User user) {
        users.put(user.getUsername(), user);
        return "redirect:/user/users";
    }

    // {username}表明其为一个路径参数
    // 将user_show.action?id=12 变为 /user/sdf
    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public String show(@PathVariable String username, Model model) {
        model.addAttribute(users.get(username));
        return "user/show";
    }


    // REST风格
    // 将user_update.action?id=12 变为 /user/ldm/update
    @RequestMapping(value = "/{username}/update", method = RequestMethod.GET)
    public String update(@PathVariable String username, Model model) {
        model.addAttribute(users.get(username));
        return "user/update";
    }

    @RequestMapping(value = "/{username}/update", method = RequestMethod.POST)
    public String update(User user, @PathVariable String username) {
        users.put(username, user);
        return "redirect:/user/users";
    }
}
