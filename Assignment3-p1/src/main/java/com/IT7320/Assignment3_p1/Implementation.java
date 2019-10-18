package com.IT7320.Assignment3_p1;

public class Implementation  implements Interface_tax{
	
	Interface_tax i;

	public double computeTax(double income) {
		// TODO Auto-generated method stub
		return i.computeTax(income);
	}

	public double weeklySalary(Employee income) {
		// TODO Auto-generated method stub
		return i.weeklySalary(income);
	}

	public double fortnightSalary(Employee income) {
		// TODO Auto-generated method stub
		return i.fortnightSalary(income);
	}

	public double computeKiwiSaver(Employee income) {
		// TODO Auto-generated method stub
		return i.computeKiwiSaver(income);
	}
	
	public void setImplementation (Interface_tax i) {
		this.i = i;
	}

}
