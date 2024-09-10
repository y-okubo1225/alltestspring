package com.example.alltestspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.alltestspring.entity.User;

/**
 * ユーザー情報 Repository
 */
@Repository
public interface  UserRepository extends JpaRepository<User, Long> {
    
}
