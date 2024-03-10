package com.example.fullstack.repository;

import com.example.fullstack.model.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<user, Long> {


}
