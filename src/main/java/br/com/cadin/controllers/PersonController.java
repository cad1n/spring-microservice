package br.com.cadin.controllers;


import br.com.cadin.Math.SimpleMath;
import br.com.cadin.converters.NumberConverter;
import br.com.cadin.exceptions.UnsuportedMathOperationException;
import br.com.cadin.model.Person;
import br.com.cadin.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static br.com.cadin.converters.NumberConverter.isNumeric;


@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService service;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> findAll() {
        return service.findAll();
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findById(@PathVariable("id") String id) {
        return service.findById(id);
    }


    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Person create(@RequestBody Person person) {
        return service.create(person);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Person update(@RequestBody Person person) {
        return service.update(person);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable("id") String id) {
        service.delete(id);
    }


}