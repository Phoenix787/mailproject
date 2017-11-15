package com.example.mailproject.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByUsernameLikeIgnoreCase(String usernameFilter);

    User findByUsernameIgnoreCase(String username);

    User findByEmail(String email);

    int countByUsernameIgnoreCase(String username);


}
