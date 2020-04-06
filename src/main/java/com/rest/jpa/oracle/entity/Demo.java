package com.rest.jpa.oracle.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Demo {
	@Id
	@Column(name = "T2_ID")
	private int id;

	@Column(name = "T2_NAME")
	private String name;
	
	@Column(name = "T2_ANNSALARY")
	private int annualSalry;
	
	@Column(name = "T2_MONSALARY")
	private int monthlySalry;
	
	public int getAnnualSalry() {
		return annualSalry;
	}

	public void setAnnualSalry(int annualSalry) {
		this.annualSalry = annualSalry;
	}

	public int getMonthlySalry() {
		return monthlySalry;
	}

	public void setMonthlySalry(int monthlySalry) {
		this.monthlySalry = monthlySalry;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

