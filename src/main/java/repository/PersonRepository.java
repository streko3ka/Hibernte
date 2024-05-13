package repository;

import entity.Person;
import entity.PersonKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, PersonKey> {
    List<Person> findPersonByCity(String city);
    List<Person> findPersonById_AgeLessThanOrderById_AgeAsc(Integer age);
    Optional<List<Person>> findPersonById_NameAndAndId_Surname(String name, String surname);
}