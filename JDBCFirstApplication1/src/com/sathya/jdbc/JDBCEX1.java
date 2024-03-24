package com.sathya.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCEX1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		//step:1 load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loaded sucessfully..");
		
	//step:2 Create the connection
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","greeshma");
		System.out.println("connection created sucessfully...");

	//step-3 Static query execution
	     Statement statement = connection.createStatement();
		String q1="create table emp(id number(5),name varchar2(10),salary number(10,2))";
		int res1= statement.executeUpdate(q1);
		System.out.println("table created successfully"+res1);
		
	}

}
