package com.calculator.www;

public class Addition {

	public static void main(String[] args) {
		Addition ad = new Addition();
		System.out.println(ad.add(7, 5) );
		System.out.println(ad.sub(7, 5) );
		System.out.println(ad.mul(7, 5) );
	}
	
	public int add(int x, int y) {
		int z = x + y;
		return z;
	}
	
	public int sub(int x, int y) {
		int z = x - y;
		return z;
	}
	
	public int mul(int x, int y) {
		int z = x * y;
		return z;
	}

}
