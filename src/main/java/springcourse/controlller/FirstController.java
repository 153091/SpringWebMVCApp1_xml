package springcourse.controlller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    // возвращаем представление
    @GetMapping("hello")
    public String helloPage() {
        return "first/hello";
    }

    // возвращаем представление
    @GetMapping("/goodbye")
    public String goodByePage() {
        return "first/goodbye";
    }
}
