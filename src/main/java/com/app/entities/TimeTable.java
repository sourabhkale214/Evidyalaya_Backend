package com.app.entities;

import java.sql.Date;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "timetable")
public class TimeTable extends BaseEntity {

	private Date date;
	@Column(name = "starttime")
	private LocalTime startTime;
	@Column(name = "endtime")
	@DateTimeFormat(pattern = "")
	private LocalTime endTime;
//	@NotBlank(message = "faculty id is required")
	@ManyToOne
	@JoinColumn(name = "facultyid")
	private User faculty;
//	@NotBlank(message = "faculty name  is required")
	@Column(name = "facultyname", length = 45)
	private String facultyName;
	@NotBlank(message = "platform  is required")
	@Column(length = 20)
	private String platform;
	@NotBlank(message = "link is required")
	@Column(length = 200)
	private String link;
	@NotBlank(message = "module name  is required")
	@Column(name = "modulename", length = 45)
	private String moduleName;

	public Long getFaculty() {
		return faculty.getId();
	}

	public TimeTable() {
		super();
	}

	public TimeTable(Long id, Date date, LocalTime startTime, LocalTime endTime, User faculty, String facultyName,
			@NotBlank(message = "platform  is required") String platform,
			@NotBlank(message = "link is required") String link,
			@NotBlank(message = "module name  is required") String moduleName) {
		super(id);
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
		this.faculty = faculty;
		this.facultyName = facultyName;
		this.platform = platform;
		this.link = link;
		this.moduleName = moduleName;
	}

	public Date getDate() {
		return date;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public String getPlatform() {
		return platform;
	}

	public String getLink() {
		return link;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public void setFaculty(User faculty) {
		this.faculty = faculty;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

//	public String getFacultyName() {
//		return faculty.getName();
//	}

}
