package com.example.springboothibernate;

import com.example.springboothibernate.model.Person;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete


public interface PersonRepository extends CrudRepository<Person, Integer> {

}