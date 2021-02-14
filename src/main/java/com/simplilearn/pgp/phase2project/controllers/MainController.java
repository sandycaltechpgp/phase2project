package com.simplilearn.pgp.phase2project.controllers;

import com.simplilearn.pgp.phase2project.dataaccess.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * Learner's Academy Spring Boot Application.
 *
 * @author Sandeep Kumar Jakkaraju
 */
@Controller
public class MainController {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@GetMapping("/")
	public String showVetList(Map<String, Object> model) {
		List<Classes> list = jdbcTemplate.query("SELECT * from class", new ClassRowMapper());

		model.put("classes", list);
		return "index.html";
	}

	@GetMapping("/students")
	public String showstudents(Map<String, Object> model, @RequestParam Integer classid) {
		System.out.println(classid);

		List<Student> list = jdbcTemplate.query("SELECT * FROM student WHERE class_id=" + classid + "",
				new StudentRowMapper());

		model.put("classid", classid);
		model.put("students", list);
		return "students.html";
	}

	@GetMapping("/teachers")
	public String showteachers(Map<String, Object> model, @RequestParam Integer classid) {
		System.out.println(classid);

		List<Teacher> list = jdbcTemplate.query("SELECT s.* from teacher as s, teacher_subject as t where t.class_id="
				+ classid + " and s.id = t.teacher_id", new TeacherRowMapper());
		model.put("classid", classid);
		model.put("list", list);
		return "teachers.html";
	}

	@GetMapping("/subjects")
	public String showSubjects(Map<String, Object> model, @RequestParam Integer classid) {
		System.out.println(classid);

		List<Subject> list = jdbcTemplate.query("SELECT s.* from subject as s, teacher_subject as t  where t.class_id="
				+ classid + " and s.id = t.subject_id", new SubjectRowMapper());

		model.put("classid", classid);
		model.put("list", list);
		return "subjects.html";
	}

}
