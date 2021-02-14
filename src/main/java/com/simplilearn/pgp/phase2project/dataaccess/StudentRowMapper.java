package com.simplilearn.pgp.phase2project.dataaccess;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class StudentRowMapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

        Student student = new Student();
        student.setId(rs.getLong("id"));
        student.setFirstName(rs.getString("first_name"));
        student.setLastName(rs.getString("last_name"));
        student.setAge(rs.getInt("age"));
        student.setGender(rs.getString("gender"));
        student.setClasses(rs.getInt("class_id"));

        return student;

    }
}