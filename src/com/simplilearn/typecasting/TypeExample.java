package com.simplilearn.typecasting;

public class TypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         byte countByte=100;
         
         int count=countByte;
         
         //implicit conversion from int to long
         long bigCount=count;
         
         float floatingCount=bigCount;
         double decimalCount=count;
         
         System.out.println("byte count::" +countByte);
         System.out.println("integer count::" +count);
         System.out.println("long count::" +bigCount);
         System.out.println("float count::" +floatingCount);
         System.out.println("decimal count::" +decimalCount);
	}

}
