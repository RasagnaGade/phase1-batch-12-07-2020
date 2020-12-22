package com.simplilearn.innerclass;

public class TestOuter {

	private int data=100;
	public String msg="Hello";
	
	class TestInner{
		public void showData() {
			System.out.println("data::"+data);
			System.out.println("msg" +msg);
		}
	}
	public static void main(String[] args) {
		TestOuter outer=new TestOuter();
		TestOuter.TestInner inner=outer.new TestInner();
		inner.showData();
	}
}
