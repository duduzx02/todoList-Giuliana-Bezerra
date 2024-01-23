package br.com.Eduardo.desafiotodoList.controller;

import br.com.Eduardo.desafiotodoList.entity.Todo;
import br.com.Eduardo.desafiotodoList.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    List<Todo> create(@RequestBody Todo todo){
        return todoService.create(todo);
    }

    @GetMapping
    List<Todo> List(){
        return todoService.list();
    }

    @PutMapping
    List<Todo> update(@RequestBody Todo todo){
        return todoService.update(todo);
    }

    @DeleteMapping("{id")
    List<Todo> delete(@PathVariable("id") Long id){
        return todoService.delete(id);
    }
}
