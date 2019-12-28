package simplepos.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import simplepos.model.User;

@Repository
public class UserDAO extends JdbcDaoSupport{
	
	@Autowired
	DataSource dataSource;
	
	@PostConstruct
	private void initialize(){
		setDataSource(dataSource);
	}
	
	public List<User> getAllUsers(){
		String sql = "SELECT * FROM users";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		List<User> result = new ArrayList<User>();
		for(Map<String, Object> row:rows){
			User user = new User();
			user.setId((Integer)row.get("id"));
			user.setName((String)row.get("name"));
			result.add(user);
		}
		
		return result;
	}
	
	public int addUser(User user) {
		String sql = "INSERT INTO users (name) VALUES (?)" ;
		return getJdbcTemplate().update(sql, new Object[]{user.getName()});
	}
}
