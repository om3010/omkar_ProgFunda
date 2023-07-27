package com.gradedproject.driver;

import com.gradedproject.Admin.Admin;
import com.gradedproject.HR.Hr;
import com.gradedproject.Tech.Tech;
import com.gradedproject.superclass.SuperClass;

public class Main {

	public static void main(String[] args) {
		SuperClass s = new Admin();
		System.out.println("Welcome to " + s.departmentName());
		System.out.println(s.getTodayswork());
		System.out.println(s.getWorkDeadline());
		System.out.println(s.isTodayAHoliday());
		System.out.println();
		s = new Hr();
		System.out.println("Welcome to " + s.departmentName());
		System.out.println(s.doActivity());
		System.out.println(s.getTodayswork());
		System.out.println(s.getWorkDeadline());
		System.out.println(s.isTodayAHoliday());
		System.out.println();
		s = new Tech();
		System.out.println("Welcome to " + s.departmentName());
		System.out.println(s.getTodayswork());
		System.out.println(s.getWorkDeadline());
		System.out.println(s.getTechStackInformation());
		System.out.println(s.isTodayAHoliday());
		System.out.println();
	}

}
