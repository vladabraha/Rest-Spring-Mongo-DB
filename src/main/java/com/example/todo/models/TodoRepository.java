package com.example.todo.models;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepository extends MongoRepository<ToDo, String> {



}
