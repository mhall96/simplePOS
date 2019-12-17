package com.project.simplepos.dao.mysql;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.project.simplepos.model.mysql.UserMySQL;

@Repository
public interface UserMySQLRepository extends JpaRepository<UserMySQL, Integer>{
	
	//List<UserMySQL> findByNameContaining(String text, String textAgain);
}