package org.launchcode.hellospring.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
//    public String helloWithQueryParam(@RequestParam String name) {
//        return "Hello, " + name + "!";
//    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String helloWithTwoQueryParam(@RequestParam String name, @RequestParam String friend){
        return "Hello, " + name + " and " + friend + "!";
    }

    @GetMapping("{name}")
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

    // lives /hello/goodbye
    @GetMapping("goodbye")
    public String goodbyeWithQueryParam(@RequestParam String name) {
        return "Goodbye, " + name + "        :(";
    }

    @GetMapping("goodbye/{name}")
    public String goodbyeWithPathParam(@PathVariable String name) {
        return "Goodbye, " + name + "        :(";
    }


    // for post request
    // lives hello/form
    @GetMapping("form")
    public String helloForm() {
        String html =
                "<html>" +
                        "<title>Post Form</title>" +
                        "<p>" +
                        "<form method = 'post' action = '/hello'>" + // submits a get request to /hello (unspecified method would be "get")
                        "<input type = 'text' name = 'name' />" + // name of the parameter is 'name' like in my controller
                        "<input type = 'text' name = 'friend' />" + // adding friend parameter
                        "<input type = 'submit' value = 'Greet Me!' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }

}

