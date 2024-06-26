package com.felipemelozx.desafioBackEndJavaJunior.controller;

import com.felipemelozx.desafioBackEndJavaJunior.entity.Todo;
import com.felipemelozx.desafioBackEndJavaJunior.service.TodoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private final TodoService service;

    public TodoController(TodoService service) {
        this.service = service;
    }

    @PostMapping
    List<Todo> create(@RequestBody @Valid Todo todo) {
        return service.create(todo);
    }
    @PutMapping(value="/{id}")
    List<Todo> update(@RequestBody Todo todo, @PathVariable Long id) {
        todo.setId(id);
        return service.update(todo);
    }

    @GetMapping
    List<Todo> list() {
        return service.list();
    }

    @DeleteMapping(value="/{id}")
    List<Todo> delete(@PathVariable Long id) {
        return service.delete(id);
    }
}