package com.app.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
@Table(name = "noticeboard")
public class NoticeBoard extends BaseEntity {

	private Date date;
	
	@NotBlank(message = "description is required")
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "facultyid")
	private User faculty;
	
	@Column(name = "facultyname")
	private String facultyName;
	
	@Column(name = "modulename")
	private String moduleName;

	public Long getFaculty() {
		return faculty.getId();
	}

	public NoticeBoard() {
		super();
	}

	public NoticeBoard(Long id, Date date, @NotBlank(message = "description is required") String description,
			User faculty, String facultyName, String moduleName) {
		super(id);
		this.date = date;
		this.description = description;
		this.faculty = faculty;
		this.facultyName = facultyName;
		this.moduleName = moduleName;
	}

	public Date getDate() {
		return date;
	}

	public String getDescription() {
		return description;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setDate(Date date) {
		this.date = date;
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

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	
	
	
	
	
	
//	public String getFacultyName() {
//		return faculty.getName();
//	}
//
//	public void setFacultyName(String facultyname) {
//		this.facultyName = facultyname;
//	}

}
