package resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AvailabilityController {
    public String status = "503 Service Unavailable";
    public String htmlPost = "<form method=\"post\" action=\"\" class=\"inline\">" +
            "<button type=\"submit\"  class=\"link-button\">\n" + "method=post\n" + "</button>\n" + "</form>";
    public String htmlGet = "<form method=\"get\" action=\"\" class=\"inline\">" +
            "<button type=\"submit\"  class=\"link-button\">\n" + "method=get\n" + "</button>\n" + "/form";

    @GetMapping(value = "/{id}")
    @ResponseBody
    public String getStatus(@PathVariable String id) {
        return status + "</br>PathVariable=" + id + htmlPost + htmlGet;
    }

    @PostMapping(value = "/{id}")
    @ResponseBody
    public String setStatus(@PathVariable String id) {
        if ("503 Service Unavailable".equals(status)) {
            status = "IR OK";
        } else if ("200 OK".equals(status)) {
            status = "503 Service Unavailable";

        } else {
            status = "default";

        }
        return status + "</br>PathVariable=" + id + htmlPost + htmlGet;
    }
}