package com.feilong.mvcstu.controller;

import com.feilong.mvcstu.entity.Person;
import com.feilong.mvcstu.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    public PersonRepository personRepository;
    @GetMapping("/add/{name}/{age}")
    public ResponseEntity<String> add(@PathVariable String name, @PathVariable Integer age){
        personRepository.save(new Person(name, age));
        return ResponseEntity.ok("添加成功");
    }

    @GetMapping("/get")
    public ResponseEntity<List<Person>> get(){
        return ResponseEntity.ok(personRepository.findAll());
    }

    @GetMapping("/test")
    public ResponseEntity<List<Person>> test(){
        return ResponseEntity.ok(personRepository.findByAgeAfter(10));
    }
}
