package com.gradedproject.superclass;

import com.gradedproject.inter.Inter;

public class SuperClass implements Inter {

	@Override
	public String departmentName() {
		// TODO Auto-generated method stub
		return "Super Department";
	}

	@Override
	public String getTodayswork() {
		// TODO Auto-generated method stub
		return "No Work As Of Now";
	}

	@Override
	public String getWorkDeadline() {
		// TODO Auto-generated method stub
		return "nil";
	}

	public String isTodayAHoliday() {
		return "Today is not a holiday";
	}

	public String doActivity() {
		return "Team Lunch";
	}

	public String getTechStackInformation() {
		return "Core Java";
	}

}
