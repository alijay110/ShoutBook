package com.shoutbook.AuthenticationService.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shoutbook.AuthenticationService.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

	User findByUsername(String username);
}
