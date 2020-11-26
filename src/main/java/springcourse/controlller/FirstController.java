package springcourse.controlller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
//@RequestMapping("/first")  // стартовый URL для всех методов (можно удалить)
public class FirstController {

    /** метод считывает параметры GET-запроса
     http://localhost:8080/hello?name=Ivan&surname=Ivanov
     required = false  -  параметры в запросе НЕ ОБЯЗАТЕЛЬНЫ
     если в запросе не указать параметры, то напечатает Hello, null null

     Model - передадим параметры Http GET-запроса в представление и отобразим их пользователю
     возвращаем представление*/
    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model) {

        // если в запросе не указать параметры, то напечатает Hello, null null
        System.out.println("Hello, " + name + " " + surname);

        // передадим параметры в Model
        model.addAttribute("message", "Hello, " + name + " " + surname);

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

    // http://localhost:8080/calculator?a=20&b=30&action=addition
    @GetMapping("/calculator")
    public String calculator(@RequestParam("a") int a, @RequestParam("b") int b,
                             @RequestParam("action") String action, Model model) {

        double result;

        switch (action) {
            case "multiplication":
                result = a * b;
                break;
            case "division":
                result = a / (double) b;
                break;
            case "subtraction":
                result = a - b;
                break;
            case "addition":
                result = a + b;
                break;
            default:
                result = 0;
                break;
        }

        model.addAttribute("result", result);

        return "first/calculator";
    }
}
