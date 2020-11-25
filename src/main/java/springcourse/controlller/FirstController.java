package springcourse.controlller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/first")  // стартовый URL для всех методов (можно удалить)
public class FirstController {

    // возвращаем представление
    @GetMapping("/hello")
    public String helloPage() {
        return "first/hello";
    }

    // возвращаем представление
    @GetMapping("/goodbye")
    public String goodbyePage() {
        return "first/goodbye";
    }
}
