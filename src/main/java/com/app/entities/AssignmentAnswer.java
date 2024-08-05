package com.app.entities;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
@Entity
@Table(name = "assignmentanswer")
public class AssignmentAnswer extends BaseEntity {

	@ManyToOne
	@JoinColumn(name = "assignmentid")
	private Assignment assignmentId;
	@ManyToOne
	@JoinColumn(name = "facultyid")
	private User faculty;
	@NotBlank(message = "file is required")
	@Column(name = "filename")
	private String fileName;
	@Column(length = 2)
	private String grade;
	@Column(length = 50)
	private String remark;
	@Column(name = "modulename")
	private String moduleName;
	@ManyToOne
	@JoinColumn(name = "studentid")
	private User student;
	@Column(name = "studentname")
	private String studentName;

	
	
	public AssignmentAnswer() {
		super();
	}
	
	public AssignmentAnswer(Long id, Assignment assignmentId, User faculty,
			@NotBlank(message = "file is required") String fileName, String grade, String remark, String moduleName,
			User student, String studentName) {
		super(id);
		this.assignmentId = assignmentId;
		this.faculty = faculty;
		this.fileName = fileName;
		this.grade = grade;
		this.remark = remark;
		this.moduleName = moduleName;
		this.student = student;
		this.studentName = studentName;
	}

	

	public Assignment getAssignmentId() {
		return assignmentId;
	}

	public User getFaculty() {
		return faculty;
	}

	public String getFileName() {
		return fileName;
	}

	public String getGrade() {
		return grade;
	}

	public String getRemark() {
		return remark;
	}

	public String getModuleName() {
		return moduleName;
	}

	public User getStudent() {
		return student;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setAssignmentId(Assignment assignmentId) {
		this.assignmentId = assignmentId;
	}

	public void setFaculty(User faculty) {
		this.faculty = faculty;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public void setStudent(User student) {
		this.student = student;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	
	
	public Long getFacultyId() {
		return faculty.getId();
	}

	public String getFacultyName() {
		return faculty.getName();
	}

	public Long getStudentId() {
		return student.getId();
	}

}
