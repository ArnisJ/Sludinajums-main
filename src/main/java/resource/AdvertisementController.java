package resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdvertisementController {
    public String htmlGet = "<form method=\"get\" action=\"status\" class=\"inline\">" +
            "<button type=\"submit\" class=\"link-button\">\n" + "show status\n" + "</button>\n" + "</form>";

    @GetMapping(value = "/n")
    @ResponseBody
    public String testEndpoint() {
        return "Hello.";
    }

    @GetMapping(value = "/hey")
    @ResponseBody
    public String nextTestEndpoint() {
        return ("hey ya") + htmlGet;
    }
}