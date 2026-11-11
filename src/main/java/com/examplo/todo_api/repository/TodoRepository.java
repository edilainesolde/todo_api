package com.examplo.todo_api.repository;
import com.examplo.todo_api.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 

public interface TodoRepository extends JpaRepository<Todo, Long> {
//ele herda os metodos save (), findALL(), findById(), deleteById() e outros da interface JpaRepository
}
