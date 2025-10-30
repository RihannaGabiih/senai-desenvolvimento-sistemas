package com.mysql.todolist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mysql.todolist.entity.Usuario;

@Repository

public interface UsuarioRepositoty extends JpaRepository<Usuario, Long> {

}
