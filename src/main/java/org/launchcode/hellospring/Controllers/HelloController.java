package org.launchcode.hellospring.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

    @GetMapping("hello")
    @ResponseBody
    public String helloWithQueryParam(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloWithPathParam(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    //    // Not sure how the redirect works yet
//    @GetMapping("hello/{name}")
//    public String helloAgainRedirect(@PathVariable String name){
//        return "redirect:/BananaPhone";
//    }

//    @GetMapping("goodbye")
//    @ResponseBody
//    public String goodbye() {
//        return "Goodbye, Spring :(";
//    }

    @GetMapping("goodbye")
    @ResponseBody
    public String goodbyeWithQueryParam(@RequestParam String name) {
        return "Goodbye, " + name + "        :(";
    }

    @GetMapping("goodbye/{name}")
    @ResponseBody
    public String goodbyeWithPathParam(@PathVariable String name){
        return "Goodbye, " + name + "        :(";
    }
}

