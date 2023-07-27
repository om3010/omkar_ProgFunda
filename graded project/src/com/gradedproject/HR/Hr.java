package com.gradedproject.HR;

import com.gradedproject.inter.Inter;
import com.gradedproject.superclass.SuperClass;

public class Hr extends SuperClass {
	public String departmentName() {
		// TODO Auto-generated method stub
		return "HR Department";
	}

	@Override
	public String getTodayswork() {
		// TODO Auto-generated method stub
		return "Fill today's timesheet and mark your attendance";
	}

	@Override
	public String getWorkDeadline() {
		// TODO Auto-generated method stub
		return "Complete by EOD";
	}

}
