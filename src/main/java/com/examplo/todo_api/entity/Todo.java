package com.examplo.todo_api.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Id;

@Entity
@Table(name = "td_todos")


public class Todo {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String titulo;
    private String descricao;
    private boolean concluido;
    public Todo() {
    }
      //Construtores
    public Todo() {
    }

    public Todo(Long id, String titulo, String descricao, boolean concluido) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluido = concluido;
    }
    //Métodos // Getters e Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }
    
}
