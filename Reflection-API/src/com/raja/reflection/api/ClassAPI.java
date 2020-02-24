package com.raja.reflection.api;

public class ClassAPI {
//in reflection api there are 4 classes mainly - Class,Method,Field,Constructor
	public static void main(String[] args) {

		String s ="Hello";
		Class<? extends String> cls = s.getClass();//to get instance of a class
		Class<?> supercls = cls.getSuperclass();
		Class<?>[] interfaces = cls.getInterfaces();
		
		Class<?> clsss = String.class;//2nd way of get class instance
		
		try {
			Class<?> clss = Class.forName("java.lang.String");//3rd way of get class instance
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
