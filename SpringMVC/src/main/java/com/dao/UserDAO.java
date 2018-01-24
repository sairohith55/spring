package com.dao;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.dto.User;

public class UserDAO {
	
	@Autowired
	private DataSource datasource;
	
	private JdbcTemplate jdbcTemplet=new JdbcTemplate(datasource);



	public void save(User user){
		
		System.out.println(datasource);
		String query = "insert into user(name,gender,email,password,date_of_birth,mobile_number) values(?,?,?,?,?,?)";
		int n = jdbcTemplet.update(query, new Object[]{user.getName(),user.getGender(),user.getEmail(),user.getPassword(),user.getDate(),user.getMobileNo()});
	    
		if(n>0){
	    	System.out.println("record inserted");
	    }else{
	    	System.out.println("some problem");
	    }
	}
 
	public void get(int id) {
		String query = "select * from user where user_id = ?";
		int n = jdbcTemplet.update(query, new Object[] {id });

		if (n > 0) {
			System.out.println("record inserted");
		} else {
			System.out.println("some problem");
		}
	}
}
