package day9_constructors;

/*
 * constructors

- method with same class name 
--donot have return type not even void 
-- used to initialize  instance variables
-- if we donot create constructor then system defined constructor is called
-- when we create object of class class constructor is called  
 */
//constructor Overloading 
class Person
{    int code ;
// no argument constructor 
Person()       {	this.code=10;}

//parameterized constructor 

Person(int u) {   code=u;  }

Person ( int a,int b){}

}
public class Construct1 {

	public static void main(String[] args) {

		Person p= new Person();//call line 16 
		Person p1= new Person(20); //call line 18 
		Person p2= new Person(30);//call line 18
		Person p3= new Person(40);//call line 18
		System.out.println(p.code); 
		
	}

}
