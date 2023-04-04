package day8_class;

import java.util.Scanner;

public class OnlineShopping {

	public static void main(String[] args) {
		
		System.out.println("1 Product");
		System.out.println("2 Seller");
		System.out.println("Enter your choice");
		Scanner s= new Scanner(System.in);
		int choice= s.nextInt();
		if(choice==1)
		{
			Product p= new Product();
			p.input();
			p.display();
		}
		else
		{
			SellerDetails s1= new SellerDetails();
			s1.input();
			s1.display();
		}
		

	}

}
