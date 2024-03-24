package com.sathya.jdbc;

public class Product {

	
		private int proid;
		private String proname;
		private double prosalary;
		
		public Product(int proid, String proname, double prosalary) {
			super();
			this.proid = proid;
			this.proname = proname;
			this.prosalary = prosalary;
		}
		

		@Override
		public String toString() {
			return "Product [proid=" + proid + ", proname=" + proname + ", prosalary=" + prosalary + "]";
		}


		public int getProid() {
			return proid;
		}

		public void setProid(int proid) {
			this.proid = proid;
		}

		public String getProname() {
			return proname;
		}

		public void setProname(String proname) {
			this.proname = proname;
		}

		public double getProsalary() {
			return prosalary;
		}

		public void setProsalary(double prosalary) {
			this.prosalary = prosalary;
		}
		public  Product()
		{
		
		}
		
	}
