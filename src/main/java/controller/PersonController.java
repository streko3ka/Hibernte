package controller;

import entity.Person;
import repository.PersonRepository;
import service.PersonsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/persons")
public class PersonController {
    private final PersonsService personsService;

    @GetMapping("/by-city")
    public List<Person> getPersonsByCity(@RequestParam String city) {
        return personsService.getPersonsByCity(city);
    }

    @GetMapping("/by-age")
    public List<Person> getPersonsByAge(@RequestParam Integer age) {
        return personsService.getPersonsByAge(age);
    }

    @GetMapping("/by-name-surname")
    public List<Person> getPersonsByNameAndSurname(@RequestParam String name, @RequestParam String surname) {
        return personsService.getPersonsByNameAndSurname(name, surname);
    }
}