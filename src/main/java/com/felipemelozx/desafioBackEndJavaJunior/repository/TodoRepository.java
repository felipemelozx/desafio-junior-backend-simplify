package com.felipemelozx.desafioBackEndJavaJunior.repository;

import com.felipemelozx.desafioBackEndJavaJunior.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
