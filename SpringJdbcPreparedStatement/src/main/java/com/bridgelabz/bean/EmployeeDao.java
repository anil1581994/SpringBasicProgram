package com.bridgelabz.bean;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Boolean saveEmployeeByPreparedStatement(final Employee e) 
	{
		String query = "insert into Emps values(?,?,?)";
		return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() 
		{

			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException
			{

				ps.setInt(1, e.getId());
				ps.setString(2, e.getName());
				ps.setFloat(3, e.getSalary());

				return ps.execute();

			}
		});
	}
	

}
