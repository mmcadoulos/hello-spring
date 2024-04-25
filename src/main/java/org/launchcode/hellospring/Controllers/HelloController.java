package org.launchcode.hellospring.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

//    @GetMapping("hello")
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
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



//    @GetMapping("form")
//    @ResponseBody
//    public String helloForm() {
//        String html =
//                "<html>" +
//                        "<p>" +
//                       /* "AHCH" +
//                        "</p>" +
//                        "<body>" +*/
//                        "<form method = 'get' action = '/hello'>" + // submits a get request to /hello (unspecified method would be "get")
//                        "<input type = 'text' name = 'name' />" + // name of the parameter is 'name' like in my controller
//                        "<input type = 'submit' value = 'Greet Me!' />" +
//                        "</form>" +
//                        "</body>" +
//                        "</html>";
//        return html;
//    }


    // for post request
    @GetMapping("form")
    @ResponseBody
    public String helloForm() {
        String html =
                "<html>" +
                        "<title>Post Form</title>" +
                        "<p>" +
                        "<form method = 'post' action = '/hello'>" + // submits a get request to /hello (unspecified method would be "get")
                        "<input type = 'text' name = 'name' />" + // name of the parameter is 'name' like in my controller
                        "<input type = 'submit' value = 'Greet Me!' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }

}

