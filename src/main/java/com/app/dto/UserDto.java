package com.app.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserDto {

	private String name;
	private String address;

//	public UserDto(String name, String address, LocalDate dob, String role) {
//		super();
//		this.name = name;
//		this.address = address;
//	}

	public UserDto() {
		super();
	}

	public UserDto(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
