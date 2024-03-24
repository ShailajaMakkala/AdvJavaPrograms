package com.sathya.jdbc;

public class Employee {

	
		private int empid;
		private String empname;
		private double empsalary;
		
		
		//Generate the argument constructor
		public Employee(int empid, String empname, double empsalary) {
			this.empid = empid;
			this.empname = empname;
			this.empsalary = empsalary;
		}
		
		//Generate toString
		@Override
		public String toString() {
			return "Employee [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary +" ]";
				
		}


		public int getEmpid() {
			return empid;
		}
		public void setEmpid(int empid) {
			this.empid = empid;
		}
		public String getEmpname() {
			return empname;
		}
		public void setEmpname(String empname) {
			this.empname = empname;
		}
		public double getEmpsalary() {
			return empsalary;
		}
		public void setEmpsalary(double empsalary) {
			this.empsalary = empsalary;
		}
		
		public Employee()
		{
		
		}
	}



