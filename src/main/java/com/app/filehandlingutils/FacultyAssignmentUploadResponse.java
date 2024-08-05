package com.app.filehandlingutils;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FacultyAssignmentUploadResponse {

	private String fileName;
	private String downloadUri;
	private long size;
	private String filecode;
	public FacultyAssignmentUploadResponse() {
		super();
	}
	public FacultyAssignmentUploadResponse(String fileName, String downloadUri, long size, String filecode) {
		super();
		this.fileName = fileName;
		this.downloadUri = downloadUri;
		this.size = size;
		this.filecode = filecode;
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
	public String getFilecode() {
		return filecode;
	}
	public void setFilecode(String filecode) {
		this.filecode = filecode;
	}

}
