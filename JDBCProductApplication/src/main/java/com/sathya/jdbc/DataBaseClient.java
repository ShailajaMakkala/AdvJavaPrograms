package com.sathya.jdbc;

public class DataBaseClient {

	public static void main(String[] args) {
		ProductDao productDao =new ProductDao();
		
		int res1=productDao.createproductTable();
		System.out.println("Table created sucessfully");
		
		
		/*int res1=productDao.save(new Product(1001,"TV",40000));
		System.out.println("Data inserted Sucessfully...."+res1);
		
		int res2=productDao.save(new Product(1002,"Refrigirater",15000));
		System.out.println("Data inserted Sucessfully...."+res2);

		int res3=productDao.save(new Product(1003,"Washigmachine",35000));
		System.out.println("Data inserted Sucessfully...."+res3);*/
		
	}

}
