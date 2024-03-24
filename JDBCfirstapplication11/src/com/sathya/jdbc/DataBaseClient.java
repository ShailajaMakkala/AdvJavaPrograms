package com.sathya.jdbc;

import java.sql.*;
import java.util.List;

public class DataBaseClient {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		EmployeeDao employeeDao=new EmployeeDao();
		
		/*int res1=employeeDao.save(new Employee(1001,"prashanth",116));
		System.out.println("Data inserted Sucessfully...."+res1);
		
		int res2=employeeDao.save(new Employee(1002,"shailu",1200));
		System.out.println("Data inserted Sucessfully...."+res2);

		int res3=employeeDao.save(new Employee(1003,"greeshma",1500));
		System.out.println("Data inserted Sucessfully...."+res3);*/
		
		Employee emp=employeeDao.findById(1001);
		System.out.println(emp);
		
		Employee emp1=employeeDao.findById(1004);
		System.out.println(emp1);
	
//		int count=employeeDao.deleteById(1023);
//		if(count==1)
//			System.out.println("data deleted successfully");
//		else
//			System.out.println("data delete failed");
		
//	    int count1=employeeDao.deleteBySalary(1200);
//		System.out.println("Number of records deleted successfully..."+count1);

		//Readubg all records
		//List<Employee> emps=employeeDao.findAll();
		//emps.forEach(emp -> System.out.println(emp));
		
		int count1=employeeDao.updateSalary(116,5000);
		System.out.println("Data updated successfully..."+count1);

	}
	}

