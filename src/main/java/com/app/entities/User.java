package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "user_detail")
public class User extends BaseEntity {

	@Column(length = 45)
	@NotBlank(message = "name is required")
	private String name;

	@NotBlank(message = "email is required")
	private String email;

	@NotBlank(message = "password is required")
	private String password;

	@Enumerated(EnumType.STRING)
	private Role role;

	//@JsonFormat(pattern = "DD-MM-YYYY")
	private LocalDate dob;

	@Column(name = "mob_no")
	private String mobNo;

	@Column(length = 45)
	@NotBlank(message = "address is required")
	private String address;

	public User() {
		super();
	}

	public User(Long id, @NotBlank(message = "name is required") String name,
			@NotBlank(message = "email is required") String email,
			@NotBlank(message = "password is required") String password, Role role, LocalDate dob, String mobNo,
			@NotBlank(message = "address is required") String address) {
		super(id);
		this.name = name;
		this.email = email;
		this.password = password;
		this.role = role;
		this.dob = dob;
		this.mobNo = mobNo;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public Role getRole() {
		return role;
	}

	public LocalDate getDob() {
		return dob;
	}

	public String getMobNo() {
		return mobNo;
	}

	public String getAddress() {
		return address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public void setAddress(String address) {
		this.address = address;
	}


//	public User(@NotBlank(message = "name is required") String name,
//			@NotBlank(message = "address is required") String address, LocalDate dob,
//			@NotBlank(message = "password is required") String password,
//			@NotBlank(message = "email is required") String email, String mobNo) {
//		super();
//		this.name = name;
//		this.address = address;
//		this.dob = dob;
//		this.password = password;
//		this.email = email;
//		this.mobNo = mobNo;
//	}
	
	

}
