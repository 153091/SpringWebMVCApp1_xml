package springcourse.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springcourse.dao.PersonDAO;
import springcourse.models.Person;

@Controller
@RequestMapping("/people")
public class PeopleController {

    private final PersonDAO personDAO;

    @Autowired
    public PeopleController(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }


    @GetMapping()
    public String showAll(Model model) {
        // получим всех людей из DAO  и передадим на представление
        model.addAttribute("people", personDAO.getAllPeople());
        return "people/showAll";
    }

    @GetMapping("/{id}")
    public String showOne(@PathVariable("id") int id, Model model) {
        // Получим одного человека по его id из DAO и направим на Представление
        model.addAttribute("person", personDAO.getPerson(id));
        return "people/showOne";
    }

    // в браузере вернется HTML форма для создания нового человека
    @GetMapping("/new")
    public String newPerson(Model model) {
        model.addAttribute("person", new Person());

        return "people/new";
    }

    // @ModelAttribute("person") Person person - для ключа "person" создает new Person и
    // заполняет его поля параметрами из HTML формы people/new
    @PostMapping()
    public String create(@ModelAttribute("person") Person person) {
        personDAO.save(person);
        // После того, как человек будет добавлен, браузер совершит
        // переход (redirect) на нужную нам страницу /people
        return "redirect:/people";
    }
}
