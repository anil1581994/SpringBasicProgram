package com.bridgelabz.bean;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

public int saveEmployee(Employee e)
{  
    String query="insert into Emps values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";  
    
    return jdbcTemplate.update(query);  
}

public int updateEmployee(Employee e)
{  
    String query="update Emps set name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' ";  
    return jdbcTemplate.update(query);  
}

	public int deleteEmployee(Employee e) 
   {
		String query = "delete from Emps where id='" + e.getId() + "' ";
		return jdbcTemplate.update(query);
	}

}
