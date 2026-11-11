package com.examplo.todo_api.service;

import org.springframework.stereotype.Service;
import com.examplo.todo_api.repository.TodoRepository;
import com.examplo.todo_api.entity.Todo;


@Service
public class TodoService {
    private final TodoRepository repository;

    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }
    public Todo save(Todo todo) {
        return repository.save(todo);
    }
}
