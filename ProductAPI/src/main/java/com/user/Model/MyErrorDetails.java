package com.user.Model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MyErrorDetails {

	
	private LocalDateTime localTime;
	private String details;
	private String massage;
}
