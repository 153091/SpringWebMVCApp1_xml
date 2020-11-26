package springcourse.controlller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
//@RequestMapping("/first")  // стартовый URL для всех методов (можно удалить)
public class FirstController {

    // метод считывает параметры GET-запроса
    // http://localhost:8080/hello?name=Ivan&surname=Ivanov
    // required = false  -  параметры в запросе НЕ ОБЯЗАТЕЛЬНЫ
    // если в запросе не указать параметры, то напечатает Hello, null null
    // возвращаем представление
    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname) {

        // если в запросе не указать параметры, то напечатает Hello, null null
        System.out.println("Hello, " + name + " " + surname);

        return "first/hello";
    }

    /** тоже самое*/
//    @GetMapping("/hello")
//    public String helloPage(HttpServletRequest request) {
//        String name = request.getParameter("name");
//        String surname = request.getParameter("surname");
//
//        // если в запросе не указать параметры, то напечатает Hello, null null
//        System.out.println("Hello, " + name + " " + surname);
//
//        return "first/hello";
//    }

    // возвращаем представление
    @GetMapping("/goodbye")
    public String goodbyePage() {
        return "first/goodbye";
    }
}
