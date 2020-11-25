package controlller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello-world")
    public String sayHello() {
        // Просто возвращаем необходимое представление
        // hello_world.html
        return "hello_world";
    }
}
