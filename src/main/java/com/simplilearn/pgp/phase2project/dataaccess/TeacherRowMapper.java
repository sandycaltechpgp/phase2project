package com.simplilearn.pgp.phase2project.dataaccess;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class TeacherRowMapper implements RowMapper<Teacher> {

    @Override
    public Teacher mapRow(ResultSet rs, int rowNum) throws SQLException {

        Teacher teacher = new Teacher();
        teacher.setId(rs.getLong("id"));
        teacher.setFirstName(rs.getString("first_name"));
        teacher.setLastName(rs.getString("last_name"));
        teacher.setAge(rs.getInt("age"));
        teacher.setGender(rs.getString("gender"));

        return teacher;

    }
}