package com.ssh.ssh.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {

    @RequestMapping("test")
    public String test(Model model){
        model.addAttribute("name","财神");
        return "index";
    }

    @RequestMapping("test1/{name}")
    public String test1(@PathVariable String name, Model model){
        model.addAttribute("name",name);
        return "detail";
    }
}
