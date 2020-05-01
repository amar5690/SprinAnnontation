package com.amar.dto;

import java.io.Serializable;

public class EmployeeDto implements Serializable {
	

	private static final long serialVersionUID = -8191690805164097326L;
	
	private String name;
	private Integer id;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	

}
