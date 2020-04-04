package com.javabasic.string;

public class StringComparationDemostration {

	public static void main(String[] args) {
		// using String pool
		String demo1 = "Tran Van Thanh";
		String demo2 = "Tran Van Thanh";
		System.out.println(demo1 == demo2); 

		
		// using String object
		String strObject1 = new String("Tran Van Thanh");
		String strObject2 = new String("Tran Van Thanh");
		System.out.println(strObject1 == strObject2);
		System.out.println(strObject1.intern() == strObject2.intern());
		
	}

}
