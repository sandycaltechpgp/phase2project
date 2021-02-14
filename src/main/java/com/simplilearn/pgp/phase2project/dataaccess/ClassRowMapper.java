package com.simplilearn.pgp.phase2project.dataaccess;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ClassRowMapper implements RowMapper<Classes> {

	@Override
	public Classes mapRow(ResultSet rs, int rowNum) throws SQLException {

		Classes customer = new Classes();
		customer.setId(rs.getLong("id"));
		customer.setName(rs.getString("name"));
		customer.setYear(rs.getString("year"));

		return customer;

	}

}