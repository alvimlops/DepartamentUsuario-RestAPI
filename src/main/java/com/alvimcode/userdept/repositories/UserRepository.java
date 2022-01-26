package com.alvimcode.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alvimcode.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
