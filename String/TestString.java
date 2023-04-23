package com.string;

public class TestString {

	public static void main(String[] args) 
	{
		String s1 = "welcome" ;						//Literal 
		String s2 = new String("welcome"); 	//using New Keyword 
		char ch[] ={'w','e','l','c','o','m','e'}; 	//char Array 

		String s3 = new String(ch);
		String s4 = "welcome";

		System.out.println("Using equals() method ");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));

		System.out.println("*************************************");

		System.out.println("Using == Operator  ");
		System.out.println(s1 == s2 );
		System.out.println(s1 == s3 );
		System.out.println(s2 == s3 );
		System.out.println(s1 == s4 );

		System.out.println("*****************************************");

		String s = "Sachin";
		s.concat("Tendulkar");
		System.out.println(s);
		s = s.concat("Tendulkar");	
		System.out.println("Concatination Using Reasign  : "+s);

		System.out.println("********************************************");

		System.out.println("Comparison Of Strings :");

		String one = "Welcome";
		String two = "Hello";
		String thrd = "WELCOME";
		String four = "Hello";

		System.out.println(one.compareTo(two));
		System.out.println((int)'W');
		System.out.println((int)'H');
		System.out.println(two.compareTo(one));
		System.out.println(one.compareTo(thrd));
		System.out.println(two.compareTo(four));

		System.out.println("**************************************************");

		System.out.println("*Substring* ");
		System.out.println(two.substring(0,3));

		System.out.println("***********************************************");

		System.out.println("* Upper & Lower Case *");
		s = "Hello";
		s1 = "welcome";
		s2 = "JAVA";

		System.out.println(s.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s1.toUpperCase());

		System.out.println("**************************************************");
		System.out.println("*Starts With & Ends With*");

		System.out.println(s.startsWith("H"));
		System.out.println(s.startsWith("h"));

		System.out.println(s.endsWith("o"));
		System.out.println(s.endsWith("O"));

		System.out.println("***********************************************");
		System.out.println("*Trim*");
		s = "  Hello ";
		System.out.println(s);
		// removes Space present front and at the end of Sentence ("  hello ") --> o/p:- "hello"
		System.out.println(s.trim());	


		System.out.println("***************************************************");
		System.out.println("*charAt*");
		s = "hello";
		System.out.println(s.charAt(2));

		System.out.println("****************************************************");
		System.out.println("*Intern*");
		s = new String("hello");
		s1 = s.intern();	
		System.out.println(s1==s);





	}

}
