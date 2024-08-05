package com.app.filehandlingutils;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FileUploadResponse {
	private String fileName;
	private String downloadUri;
	private long size;
	private Long studentId;
	private Long assignmentId;
	public FileUploadResponse() {
		super();
	}
	public FileUploadResponse(String fileName, String downloadUri, long size, Long studentId, Long assignmentId) {
		super();
		this.fileName = fileName;
		this.downloadUri = downloadUri;
		this.size = size;
		this.studentId = studentId;
		this.assignmentId = assignmentId;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getDownloadUri() {
		return downloadUri;
	}
	public void setDownloadUri(String downloadUri) {
		this.downloadUri = downloadUri;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public Long getAssignmentId() {
		return assignmentId;
	}
	public void setAssignmentId(Long assignmentId) {
		this.assignmentId = assignmentId;
	}
	
	
	
	
	
}
