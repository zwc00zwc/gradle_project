package project_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import project_core.Test;

@Controller
@RequestMapping(value = "/home")
public class HomeController {

    @ResponseBody
    @RequestMapping(value = "/index")
    public String index()
    {
        return "index";
    }
}
