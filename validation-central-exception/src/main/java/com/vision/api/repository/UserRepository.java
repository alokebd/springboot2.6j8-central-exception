package com.vision.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vision.api.entity.User;

public interface UserRepository  extends JpaRepository<User,Integer> {
    User findByUserId(int id);
}
