package springcourse.dao;

import org.springframework.stereotype.Component;
import springcourse.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {

    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT, "Alex"));
        people.add(new Person(++PEOPLE_COUNT, "Tom"));
        people.add(new Person(++PEOPLE_COUNT, "Joe"));
        people.add(new Person(++PEOPLE_COUNT, "Mike"));
    }

    public List<Person> getAllPeople() {
        return people;
    }

    public Person getPerson(int id) {
        return people.stream()
                    .filter(person -> person.getId() == id)
                    .findAny()
                    .orElse(null);
    }

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }
}
