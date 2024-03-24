package com.sathya.jdbc;

import java.sql.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao 
{
	public int save(Employee emp) 
	{
		//Dclare the  resources
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		int count=0;
		try
		{
			//get the connection
			connection=DbConnection.createconnection();
			
			//create the  ps object
			preparedStatement=connection.prepareStatement("insert into emp values(?,?,?)");
			
			//Read the data from emp object & set to prarameters
			preparedStatement.setInt(1, emp.getEmpid());
			preparedStatement.setString(2,emp.getEmpname());
			preparedStatement.setDouble(3,emp.getEmpsalary());
			
			count=preparedStatement.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			
		}
		finally {
			//before release connection  v he the connection present or not
			try
			{
			if(connection!=null)
				connection.close();
			if(preparedStatement!=null)
				preparedStatement.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		return count;
		}
	
	public Employee findById(int  empId) throws SQLException
	{
		Employee employee=null;
		
		try(Connection connection=DbConnection.createconnection();
				PreparedStatement preparedStatement=connection.prepareStatement("select * from emp where empId=?"))
		{
			preparedStatement.setInt(1,empId);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next())
			{
				employee=new Employee();
				employee.setEmpid(resultSet.getInt(1));
				employee.setEmpname(resultSet.getString(2));
				employee.setEmpsalary(resultSet.getDouble(3));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
			}
		return employee;
		}
		
	public int deleteById1(int empId) throws SQLException
	{
		int count=0;
		try(Connection connection=DbConnection.createconnection();
				PreparedStatement preparedStatement=connection.prepareStatement("delete * from emp where empId=?"))
		{
			preparedStatement.setInt(1, empId);
			count=preparedStatement.executeUpdate();
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return count;
	}	
	public int deleteBySalary(double empSalary) {
		int count1=0;
		try(Connection connection=DbConnection.createconnection();
				PreparedStatement preparedStatement=connection.prepareStatement("delete from emp where empSalary>?"))
		{
			preparedStatement.setDouble(1,empSalary);
			
			count1=preparedStatement.executeUpdate();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return count1;
	}
	public List<Employee> findAll(){
		// Create the list to store group of records
	    List<Employee> emps=new ArrayList<Employee>();
	    try(Connection connection =DbConnection.createconnection();
	    	Statement statement =connection.createStatement();	){
	    	//excecute the query to store the resultset                                                                                
	    	ResultSet resultSet=statement.executeQuery("select * from emp");
	    	while(resultSet.next()) {
	    		Employee employee=new Employee();
	    		employee.setEmpid(resultSet.getInt(1));
	    		employee.setEmpname(resultSet.getString(2));
	    		employee.setEmpsalary(resultSet.getDouble(3));
	    		emps.add(employee);
	    	
	    	
	    	}
	    }
	    	catch(SQLException e) {
	    		e.printStackTrace();
	    	}
	    	
	    
	    return emps;
	    }
	public int updateSalary(double currentSalary,double incSalary) {
		int count1=0;
		try(Connection connection=DbConnection.createconnection();
				PreparedStatement preparedStatement=connection.prepareStatement("UPDATE emp set empSalary=? where empSalary>? "))
		{
			preparedStatement.setDouble(1,incSalary);
			preparedStatement.setDouble(2,currentSalary);

			
			count1=preparedStatement.executeUpdate();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return count1;
	}
	
			
}
