package com.user.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.springframework.validation.annotation.Validated;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Validated
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Admin {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Min(6)
	private String name;
	@Email
	private String email;
	@Pattern(regexp = "[0-9]{10}")
	private String phone;
	@Min(8)
	private String password;
	private String city;
	private String state;
	private String country;
}
