package com.example.LearningJDBCImplementation.util;

import java.sql.Connection;
import java.sql.Statement;

public class DBInit {

    public static void init() {
        String sql = """
           CREATE TABLE users (
               id BIGINT AUTO_INCREMENT PRIMARY KEY,
               name VARCHAR(100) NOT NULL,
               email VARCHAR(150) NOT NULL
           )
        """;

        try (Connection con = DBConnection.getConnection();
             Statement stmt = con.createStatement()) {

            stmt.execute(sql);
            System.out.println("Users table created");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
