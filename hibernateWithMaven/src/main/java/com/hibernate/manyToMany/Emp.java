package com.hibernate.manyToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Emp {
	
	@Id
	private int empId;
	private String Empname;
	
	@ManyToMany
	private List<Project> projects;
	public Emp() {
		super();
		
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	public Emp(int empId, String empname, List<Project> projects) {
		super();
		this.empId = empId;
		Empname = empname;
		this.projects = projects;
	}

}
