package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "assignment")
public class Assignment extends BaseEntity {

	@Column(length = 200)
	private String description;

	@ManyToOne
	@JoinColumn(name = "facultyid")
	private User faculty;

	@Column(name = "facultyname", length = 45)
	private String facultyName;

	@Column(name = "filename", length = 45)
	private String fileName;

	@Column(name = "modulename", length = 45)
	private String moduleName;

	public Long getFaculty() {
		return faculty.getId();
	}

	public Assignment() {
		super();
	}

	public Assignment(Long id, String description, User faculty, String facultyName, String fileName,
			String moduleName) {
		super(id);
		this.description = description;
		this.faculty = faculty;
		this.facultyName = facultyName;
		this.fileName = fileName;
		this.moduleName = moduleName;
	}

	public String getDescription() {
		return description;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public String getFileName() {
		return fileName;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setFaculty(User faculty) {
		this.faculty = faculty;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	
}
