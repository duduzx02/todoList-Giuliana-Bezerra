package br.com.Eduardo.desafiotodoList.repository;

import br.com.Eduardo.desafiotodoList.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository <Todo, Long> {
}
