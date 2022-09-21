package com.cvs.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Entity
@Table(name="hospitals")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Hospital extends BaseEntity {
		//id,name,contactNo,email,address
	@NotNull(message = "Name cannot be null")
	@Column(name="hospital_name",length=50)
	private String name;
	
//	@Pattern(regexp="(^$|[0-9]{10})")
	@Column(name="contact_no")
	private String contactNo;
	
	@Email(message="Email should be valid !!")
	private String email;
	
	private String password;
	
	@NotEmpty
	@Column(name="address")
	private String address;
	
}
