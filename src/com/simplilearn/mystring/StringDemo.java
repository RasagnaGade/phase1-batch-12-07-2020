package com.simplilearn.mystring;

public class StringDemo {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println("Str1:" + str1.hashCode());
		System.out.println("str1:" + str2.hashCode());
		
		if(str1==str2) {
			System.out.println("Same String");
		}
		

		str1 = "hi";
		System.out.println("Str1:" + str1);
		System.out.println("str1:" + str2);
		
		
		String name1=new String("Andy Smith");
		String name2=new String("Andy Smith");
		System.out.println("name:" +name1);
		System.out.println("name:" +name2);
		
		if(name1==name2) {
			System.out.println("Same name");
		}else {
			System.out.println("Diff name");
		}
		
	}

}
