package ru.vasilyev.springcourse.LibraryBoot.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vasilyev.springcourse.LibraryBoot.models.Person;


@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
    Person findByName(String name);
}
