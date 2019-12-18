package com.project.simplepos.dao.mysql;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.project.simplepos.model.mysql.UserMySQL;

@Repository
public interface UserMySQLRepository extends JpaRepository<UserMySQL, Integer>{

}