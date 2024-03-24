package com.sathya.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessingEx {

	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection =DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","system","greeshma");
		
		Statement statement=connection.createStatement();
		statement.addBatch("create table Student(id numbere,name varchar2(10)");
		
		statement.addBatch("insert into Student values(111,'Rathan')");
		statement.addBatch("insert into Student values(112,'Anu')");
		
		statement.addBatch("delete from Student where id in(111,222)");
		statement.addBatch("drop table Student");
		
		int[] result=statement.executeBatch();
		
		for(int result1:result)
			System.out.println(result1);
		
		connection.close();

				

		
		
		
	}

}
