package com.gradedproject.Tech;

import com.gradedproject.inter.Inter;
import com.gradedproject.superclass.SuperClass;

public class Tech extends SuperClass implements Inter {

	@Override
	public String departmentName() {
		// TODO Auto-generated method stub
		return "Tech Department";
	}

	@Override
	public String getTodayswork() {
		// TODO Auto-generated method stub
		return "Complete coding of module 1";
	}

	@Override
	public String getWorkDeadline() {
		// TODO Auto-generated method stub
		return "Complete by EOD";
	}

}
