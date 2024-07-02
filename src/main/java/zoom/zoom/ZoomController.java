package zoom.zoom;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class ZoomController {
    @GetMapping("/")
    public String forwardString() {
        return "index";
    }
    

}
