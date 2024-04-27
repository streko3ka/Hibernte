package repository;

import entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

public class PersonRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> getPersonsByCity(String city) {
        String databaseQuery = "SELECT person FROM Person person WHERE person.city_of_living = :city";
        return entityManager.createQuery(databaseQuery, Person.class)
                .setParameter("city", city)
                .getResultList();
    }
}