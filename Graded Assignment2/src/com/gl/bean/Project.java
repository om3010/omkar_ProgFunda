package com.gl.bean;

import java.io.Serializable;

public class Project implements Serializable {
	String projectCode;
	String projectName;
	int strength;
	public String getProjectCode() {
		return projectCode;
	}
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public Project(String projectCode, String projectName, int strength) {
		super();
		this.projectCode = projectCode;
		this.projectName = projectName;
		this.strength = strength;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Project [projectCode=" + projectCode + ", projectName=" + projectName + ", strength=" + strength + "]";
	}
	
}
