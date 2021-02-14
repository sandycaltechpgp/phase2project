package com.simplilearn.pgp.phase2project.dataaccess;

/**
 * Learner's Academy Spring Boot Application.
 *
 * @author Sandeep Kumar Jakkaraju
 */
public class Classes {

	private Long id;

	private String year;

	private String name;

	private String studentsLink;

	private String teachersLink;

	private String subjectsLink;

	public Classes(Long id, String year, String name) {
		this.id = id;
		this.year = year;
		this.name = name;
	}

	public Classes() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getStudentsLink() {
		this.studentsLink = "/students?classid=" + id;
		return studentsLink;
	}

	public void setStudentsLink(String studentLink) {
		this.studentsLink = studentLink;
	}

	public String getTeachersLink() {
		this.teachersLink = "/teachers?classid=" + id;
		return teachersLink;
	}

	public void setTeachersLink(String teacherLink) {
		this.teachersLink = teacherLink;
	}

	public String getSubjectsLink() {
		this.subjectsLink = "/subjects?classid=" + id;
		return subjectsLink;
	}

	public void setSubjectsLink(String subjectsLink) {
		this.subjectsLink = subjectsLink;
	}

}
