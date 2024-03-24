package com.sathya.jdbc;

import java.sql.SQLException;
import java.util.List;

public class DataBaseClient {

	public static void main(String[] args) throws SQLException
	{
		ProductDao productDao =new ProductDao();
		
	/*	int res1=productDao.createproductTable();
		System.out.println("Table created sucessfully"+res1);*/
		
		//inserting data 
		/*int res1=productDao.save(new Product(1001,"TV",30000));
		System.out.println("Data inserted Sucessfully...."+res1);
		
		int res2=productDao.save(new Product(1002,"Refri",12000));
		System.out.println("Data inserted Sucessfully...."+res2);

		int res3=productDao.save(new Product(1003,"Washing",30000));
		System.out.println("Data inserted Sucessfully...."+res3);
		
		int res4=productDao.save(new Product(1003,"sofa",300));
		System.out.println("Data inserted Sucessfully...."+res4);
		
		int res5=productDao.save(new Product(1003,"dricleaner",25000));
		System.out.println("Data inserted Sucessfully...."+res5);*/
		
		//finding details through id
		/*Product pro=productDao.getProductById(1001);
		System.out.println(pro);*/
		
		
		//get all product details
		/*List<Product> pl=productDao.getAllProducts();
		pl.forEach(pro -> System.out.println(pro));*/
		
		//price updating
		//int count1=productDao.updateByPrice(30000, 15000);
		//System.out.println("Data updated successfully"+ count1);
		
		/*//delete by id
		int count4=productDao.deleteById(1001);
		System.out.println("Data deleted successfully"+count4);*/
		
		int count2=productDao.deleteByprice(3000.50);
		System.out.println("price deleted successfully"+count2);
		
		/*int count3=productDao.dropTable();
		System.out.println("Table dropped successfully"+count3);*/
		
		
		
		
		
	}

}
