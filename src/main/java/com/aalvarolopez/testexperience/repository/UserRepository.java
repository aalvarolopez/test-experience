package com.aalvarolopez.testexperience.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.aalvarolopez.testexperience.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
