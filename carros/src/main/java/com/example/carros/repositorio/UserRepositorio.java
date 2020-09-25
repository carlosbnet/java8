package com.example.carros.repositorio;

import com.example.carros.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositorio extends JpaRepository<User,Long> {

    User findByLogin(String login);

}
