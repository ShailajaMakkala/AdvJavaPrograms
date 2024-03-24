package com.sathya.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySqlConn {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc.mysql://localhost/greeshma","root","root");
		System.out.println("connection created with sql Database");	
		
		PreparedStatement preparedStatement=connection.prepareStatement("insert into emp values(?,?,?)");
		preparedStatement.setInt(1,111);
		preparedStatement.setString(1,"Navya");
		preparedStatement.setFloat(1,10000.45f);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1,222);
		preparedStatement.setString(1,"kavya");
		preparedStatement.setFloat(1,20000.45f);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1,333);
		preparedStatement.setString(1,"lavanya");
		preparedStatement.setFloat(1,30000.45f);
		preparedStatement.addBatch();
		
		connection.close();
		System.out.println("Connection closed sucessfully");
	}

}
