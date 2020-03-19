package lukasz.slowak.CovertIt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/mathOperations")
    public String mathOperations(){
        return "mathOperations";
    }

    @GetMapping("/unitConverter")
    public String unitConverter(){
        return "unitConverter";
    }

    @GetMapping("/tripCost")
    public String tripCost(){
        return "tripCost";
    }

}
