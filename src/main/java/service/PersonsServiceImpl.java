package service;

import lombok.RequiredArgsConstructor;
import entity.Person;
import repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonsServiceImpl implements PersonsService {
    private final PersonRepository personsRepository;
    @Override
    public List<Person> getPersonsByCity(String city) {
        return personsRepository.findPersonByCity(city);
    }

    @Override
    public List<Person> getPersonsByAge(Integer age) {
        return personsRepository.findPersonById_AgeLessThanOrderById_AgeAsc(age);
    }

    @Override
    public List<Person> getPersonsByNameAndSurname(String name, String surname) {
        return personsRepository.findPersonById_NameAndAndId_Surname(name, surname).orElse(null);
    }
}