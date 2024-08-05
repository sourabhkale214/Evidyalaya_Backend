package com.app.dto;

import com.app.entities.Assignment;
import com.app.entities.User;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AssignmentAnswerDto {

	private Assignment assignmentId;

	private String grade;

	private String remark;

	private User student;

	private String studentName;

	private String description;

	private User faculty;

	private String fileName;

	private String moduleName;

	public Long getFacultyId() {
		return faculty.getId();
	}

	public String getFacultyName() {
		return faculty.getName();
	}

	public Long getStudentId() {
		return student.getId();
	}

	public AssignmentAnswerDto() {
		super();
	}

	public AssignmentAnswerDto(Assignment assignmentId, String grade, String remark, User student, String studentName,
			String description, User faculty, String fileName, String moduleName) {
		super();
		this.assignmentId = assignmentId;
		this.grade = grade;
		this.remark = remark;
		this.student = student;
		this.studentName = studentName;
		this.description = description;
		this.faculty = faculty;
		this.fileName = fileName;
		this.moduleName = moduleName;
	}

	public Assignment getAssignmentId() {
		return assignmentId;
	}

	public void setAssignmentId(Assignment assignmentId) {
		this.assignmentId = assignmentId;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public User getStudent() {
		return student;
	}

	public void setStudent(User student) {
		this.student = student;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getFaculty() {
		return faculty;
	}

	public void setFaculty(User faculty) {
		this.faculty = faculty;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	
	
	
}
