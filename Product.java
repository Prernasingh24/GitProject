package day8_class;

import java.util.Scanner;

public class Product 
{

	String pname;
	int price;
	int qty;
	
	void input()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter product name");
		pname=s.next();
		System.out.println("enter product price");
	
		price=s.nextInt();
		System.out.println("enter product qty");
		qty=s.nextInt();			
	}
	void display()
	{
		System.out.println(pname +"  "+ price +"  "+ qty);
	}
	 

}
