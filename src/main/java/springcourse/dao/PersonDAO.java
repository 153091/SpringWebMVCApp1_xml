package springcourse.dao;

import org.springframework.stereotype.Component;
import springcourse.models.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;

    private static final String URL = "jdbc:h2:~/test";
    private static final String USERNAME = "sa";
    private static final String PASSWORD = "sa";

    private static Connection connection;

    static {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public List<Person> getAllPeople() {
        List<Person> people = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            String SQL = "SELECT * FROM PERSON";
            ResultSet resultSet = statement.executeQuery(SQL);
            while (resultSet.next()) {
                Person person = new Person();
                person.setId(resultSet.getInt("id"));
                person.setName(resultSet.getString("name"));
                person.setAge(resultSet.getInt("age"));
                person.setEmail(resultSet.getString("email"));

                people.add(person);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return people;
    }

    public Person getPerson(int id) {
//        return people.stream()
//                    .filter(person -> person.getId() == id)
//                    .findAny()
//                    .orElse(null);


//        String SQL = "SELECT * FROM PERSON WHERE ID=?";
//        Person person = new Person();
//        try {
//            PreparedStatement statement = connection.prepareStatement();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
        return null;
    }

    public void save(Person person) {
//        person.setId(++PEOPLE_COUNT);
//        people.add(person);

        try {
            Statement statement = connection.createStatement();

            String SQL ="INSERT INTO Person VALUES(" + 1 + ",'" + person.getName() +
                    "'," + person.getAge() + ",'" + person.getEmail() + "')";

            statement.executeUpdate(SQL);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void update(int id, Person updatedPerson) {
//        Person personToBeUpdate = getPerson(id);
//
//        personToBeUpdate.setName(updatedPerson.getName());
//        personToBeUpdate.setAge(updatedPerson.getAge());
//        personToBeUpdate.setEmail(updatedPerson.getEmail());
    }

    // реализовано в виде формы в showOne.html
    public void delete(int id) {
        // проходимся по всем элементам списка
        // если Id у Person == id, то удаляем
//        people.removeIf(p -> p.getId() == id);
    }
}
