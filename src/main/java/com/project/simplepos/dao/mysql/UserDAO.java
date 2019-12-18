package com.project.simplepos.dao.mysql;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.project.simplepos.model.mysql.UserMySQL;

@Repository
public class UserDAO extends JdbcDaoSupport{
	
	@Autowired
	DataSource dataSource;
	
	@PostConstruct
	private void initialize(){
		setDataSource(dataSource);
	}
	
	public List<UserMySQL> getAllUsers(){
		String sql = "SELECT * FROM users";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		List<UserMySQL> result = new ArrayList<UserMySQL>();
		for(Map<String, Object> row:rows){
			UserMySQL user = new UserMySQL();
			user.setId((Integer)row.get("id"));
			user.setName((String)row.get("name"));
			result.add(user);
		}
		
		return result;
	}
	
	public int addUser(UserMySQL user) {
		String sql = "INSERT INTO users (name) VALUES (?)" ;
		return getJdbcTemplate().update(sql, new Object[]{user.getName()});
	}
}
