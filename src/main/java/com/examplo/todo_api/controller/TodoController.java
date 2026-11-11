package com.exemplo.todo_api.controller;

import com.exemplo.todo_api.entity.Todo;
import com.exemplo.todo_api.service.TodoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/todos")
public class TodoController {
    private final TodoService service;

    public TodoController(TodoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Todo> criar(@RequestBody Todo todo) {
        Todo novoTodo = service.save(todo);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoTodo);
    }
}