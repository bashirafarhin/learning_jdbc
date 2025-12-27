package com.example.LearningJPA.repository;

import com.example.LearningJPA.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
