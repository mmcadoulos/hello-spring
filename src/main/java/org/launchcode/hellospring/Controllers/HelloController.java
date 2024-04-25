package org.launchcode.hellospring.Controllers;

import com.sun.source.tree.SwitchTree;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.invoke.SwitchPoint;
import java.util.Objects;

@Controller
@ResponseBody
@RequestMapping("/")
public class HelloController {
    public static String createMessage(String n, String l) {
        String greeting;
        if (Objects.equals(l, "en")) {
            greeting = "Hello, " + n + "!";
        } else if (Objects.equals(l, "grc")) {
            greeting = "Χαῖρε, " + n + "!";
        } else if (Objects.equals(l, "el")) {
            greeting = "Γειά σας, " + n + "!";
        } else if (Objects.equals(l, "he")) {
            greeting = "!" + n + " ,שׁלום";
        } else if (Objects.equals(l, "es")) {
            greeting = "¡Hola, " + n + "!";
        } else {
            return "oops";
        }
        return "<html>" +
                "<h1 style= \"font-size: 20;\">" +
                greeting +
                "</h1?";
    }

//    @GetMapping("/")
//    public String index() {
//        return "" +
//                "<html>" +
//                "<form method = 'get' action = '/form'>" +
//                "<input type = 'submit' value = 'begin!'>" +
//                "</form>";
//    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
    public String helloWithQueryParam(@RequestParam String name, @RequestParam String language) {
        if (name == null) {
            name = "World";
        }
        return createMessage(name, language);
    }

    @GetMapping("/")
    public String helloForm() {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'post' action = '/hello'>" + // submits a get request to /hello (unspecified method would be "get")
                        "<input type = 'text' name = 'name' />" + // name of the parameter is 'name' like in my controller
                        "<select name = 'language' id = 'language-select'>" +
                        "<option value=\"\">--Please choose an option--</option>" +
                        "<option value=\"en\">English</option>" +
                        "<option value=\"grc\">Greek, Ancient</option>" +
                        "<option value=\"el\">Greek, Modern</option>" +
                        "<option value=\"he\">Hebrew</option>" +
                        "<option value=\"es\">Spanish</option>" +
                        "</select>" +
                        "<input type = 'submit' value = 'Greet Me!' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }

}

