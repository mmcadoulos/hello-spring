package org.launchcode.hellospring.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyTestController {
    @GetMapping("/")
    @ResponseBody
    public String myTest(){
        return "Go to localhost:8080/hello for the message";
    }
}
