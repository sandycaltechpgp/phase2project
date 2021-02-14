package com.simplilearn.pgp.phase2project.dataaccess;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Learner's Academy Spring Boot Application.
 *
 * @author Sandeep Kumar Jakkaraju
 */
public class SubjectRowMapper implements RowMapper<Subject> {

	@Override
	public Subject mapRow(ResultSet rs, int rowNum) throws SQLException {

		Subject subject = new Subject();
		subject.setId(rs.getLong("id"));
		subject.setName(rs.getString("name"));

		return subject;

	}

}