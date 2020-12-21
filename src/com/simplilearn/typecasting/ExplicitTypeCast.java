package com.simplilearn.typecasting;

public class ExplicitTypeCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         double price=100.49;
         long priceLong=(long)price;
         int priceInt=(int)priceLong;
         byte priceByte=(byte)priceInt;
         
         System.out.println("Double price value::"+price);
         System.out.println("long price value::"+priceLong);
	System.out.println("int price value::"+priceInt);
	System.out.println("byte price value::"+priceByte);
	}
}
