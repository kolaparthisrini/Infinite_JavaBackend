package com.infinite.collections;

public class ExceptExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
		int a =1/0;
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		finally
		{
			System.out.println(".....");	
		}
	}

}
