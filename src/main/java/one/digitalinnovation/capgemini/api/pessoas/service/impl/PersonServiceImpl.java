package one.digitalinnovation.capgemini.api.pessoas.service.impl;

import lombok.AllArgsConstructor;
import one.digitalinnovation.capgemini.api.pessoas.entity.Person;
import one.digitalinnovation.capgemini.api.pessoas.repository.PersonRepository;
import one.digitalinnovation.capgemini.api.pessoas.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Cristian Urbainski
 * @since 29/09/2021
 */
@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Override
    public Person save(Person person) {

        return personRepository.save(person);
    }

}