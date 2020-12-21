package com.simplilearn.typecasting;

public class StringToNumericConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String price="100";
         int priceInt=Integer.parseInt(price);
         byte priceByte=Byte.parseByte(price);
         double priceDouble=Double.parseDouble(price);
         
         System.out.println("integer price::" +priceInt);
         System.out.println("byte price::" +priceByte);
         System.out.println("Double price::" +priceDouble);
         }

}
