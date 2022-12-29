package com.example;

import org.springframework.jdbc.core.JdbcTemplate;

public class AgentDao {

	JdbcTemplate jdbcTemplate;
	public void setjdbcTemplate(JdbcTemplate jdbcTemplate) 
	{
		this.jdbcTemplate=jdbcTemplate;
		
	}
	
	public int saveAgent(Agent a) 
	{
		String query="insert into Agent values('"+a.getA_id()+"','"+a.getA_name()+"','"+a.getA_salary()+"')";
		return jdbcTemplate.update(query);
		
	}
	
	public int updateAgent(Agent a) 
	{
		String query="update Agent set salary='"+a.getA_salary()+"'where id='"+a.getA_id()+"'";
		return jdbcTemplate.update(query);
	}
	public int deleteAgent(Agent a) 
	{
		String query="delete from Agent where id='"+a.getA_id()+"'";
		return jdbcTemplate.update(query);
		
		
		
	}

}
