package com.gradedproject.Admin;

import com.gradedproject.inter.Inter;
import com.gradedproject.superclass.SuperClass;

public class Admin extends SuperClass implements Inter {
	public String departmentName() {
		// TODO Auto-generated method stub
		return "Admin Department";
	}

	@Override
	public String getTodayswork() {
		// TODO Auto-generated method stub
		return "Complete your documents submission";
	}

	@Override
	public String getWorkDeadline() {
		// TODO Auto-generated method stub
		return "Complete by EOD";
	}

}
