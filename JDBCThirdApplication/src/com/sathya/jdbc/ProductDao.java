package com.sathya.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {

	
		public int createproductTable() throws SQLException
		{
			Connection connection=null;
			Statement statement=null;
			int count=0;
		try
		{
			//get the connection
			connection=DbConnection.createconnection();
			
			//create the ps object
			statement=connection.createStatement();
			String q1="create table Product(proid number,proname varchar2(20),proprice number)";
			count=statement.executeUpdate(q1);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			
		}
		finally {
			//before release connection  v he the connection present or not
			
			
			if(connection!=null)
				connection.close();
			if(statement!=null)
				statement.close();
		}
		return count;
		}
		public int save(Product Product) 
		{
			//Dclare the  resources
			Connection connection=null;
			PreparedStatement preparedStatement=null;
			int count1=0;
			try
			{
				//get the connection
				connection=DbConnection.createconnection();
				
				//create the  ps object
				preparedStatement=connection.prepareStatement("insert into Product values(?,?,?)");
				
				//Read the data from emp object & set to prarameters
			
				preparedStatement.setInt(1, Product.getProid());
				preparedStatement.setString(2,Product.getProname());
				preparedStatement.setDouble(3,Product.getProprice());
				
				count1=preparedStatement.executeUpdate();
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
			return count1;
			}
		public Product getProductById(int  proid) throws SQLException
		{
			Product product=null;
			
			try(Connection connection=DbConnection.createconnection();
					PreparedStatement preparedStatement=connection.prepareStatement("select * from Product where proid=?"))
			{
				preparedStatement.setInt(1,proid);
				ResultSet resultSet=preparedStatement.executeQuery();
				if(resultSet.next())
				{
					product=new Product();
					product.setProid(resultSet.getInt(1));
					product.setProname(resultSet.getString(2));
					product.setProprice(resultSet.getDouble(3));
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
				}
			return product;
			}
		
		public List<Product> getAllProducts() 
		{
			
		List<Product> Product=new ArrayList<Product>();
			try(Connection connection=DbConnection.createconnection();
					Statement statement=connection.createStatement())
			{
				ResultSet resultSet=statement.executeQuery("select * from Product");
				
				while(resultSet.next())
				{
					Product product=new Product();
					
					product.setProid(resultSet.getInt(1));
					product.setProname(resultSet.getString(2));
					product.setProprice(resultSet.getDouble(3));
					Product.add(product);
				}
			}
				catch(SQLException e) 
				{
					e.printStackTrace();
				}
				return Product;
		}
		public int updateByPrice(double priceRange,double IncreamentValue) 
		{
			int count1=0;
			
			try(Connection connection=DbConnection.createconnection();
					PreparedStatement preparedStatement=connection.prepareStatement("UPDATE Product set proprice=proprice+? where proprice>? "))
			{
				preparedStatement.setDouble(1,IncreamentValue);
				preparedStatement.setDouble(2,priceRange);

				
				count1=preparedStatement.executeUpdate();
				
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			return count1;
		}
		
		public int deleteById(int proid) {
			int count2=0;
			try(Connection connection=DbConnection.createconnection();
					PreparedStatement preparedStatement=connection.prepareStatement("delete from Product where proid=?"))
			{
				preparedStatement.setDouble(1,proid);
				
				count2=preparedStatement.executeUpdate();
				
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			return count2;
		}

		
				
		public int deleteByprice(double price) {
			int count2=0;
			try(Connection connection=DbConnection.createconnection();
					PreparedStatement preparedStatement=connection.prepareStatement("delete from Product where proprice>?"))
			{
				preparedStatement.setDouble(1,400);
				
				count2=preparedStatement.executeUpdate();
				
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			return count2;
		}
		
		
	public int dropTable() throws SQLException 
	{
		Connection connection=null;
		Statement statement=null;
		int count=0;
	try
	{
		//get the connection
		connection=DbConnection.createconnection();
		
		//create the ps object
		statement=connection.createStatement();
		String q2="drop table Product";
		count=statement.executeUpdate(q2);
	}
	catch(SQLException e)
	{
		e.printStackTrace();
		
	}
	finally {
		//before release connection  v he the connection present or not
		
		
		if(connection!=null)
			connection.close();
		if(statement!=null)
			statement.close();
	}
	return count;
	}
}

