package com.sathya.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class ProcedureExecutionEx {

	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection =DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","system","greeshma");
		
		//call the procedure
		CallableStatement callableStatement=connection.prepareCall("{call getById(?,?,?,?)}");
		
		//set the input data
		callableStatement.setInt(1, 1001);
		
		//register one variable to store the output
		callableStatement.registerOutParameter(2, Types.INTEGER);
		callableStatement.registerOutParameter(3, Types.VARCHAR);
		callableStatement.registerOutParameter(4, Types.FLOAT);


		
		//execute the procedure the output wil be stored in the registerd parameter
		callableStatement.executeUpdate();
		
		//print the output
		System.out.println(callableStatement.getInt(2));
		System.out.println(callableStatement.getString(3));
		System.out.println(callableStatement.getFloat(4));


		
		connection.close();
	}

}
