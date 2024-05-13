package service;

import entity.Person;
import java.util.List;

public interface PersonsService {
    List<Person> getPersonsByCity(String city);
    List<Person> getPersonsByAge(Integer age);
    List<Person> getPersonsByNameAndSurname(String name, String surname);
}