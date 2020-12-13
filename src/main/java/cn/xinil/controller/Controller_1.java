package cn.xinil.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Controller_1{
    @RequestMapping(value = "/hello/{a}", method = RequestMethod.GET)
    public String c1_1(@PathVariable String a, Model model){
        model.addAttribute("msg", "我想 显示的信息。a = " + a);
        return "hello";  //会被视图解析器处理
    }
}
