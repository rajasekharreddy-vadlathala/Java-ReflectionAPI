package com.raja.reflection.api;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.raja.reflection.model.Employee;
import com.raja.reflection.model.Person;

//getDeclaredFileds method will be used to get all public/private/protected fields and cannot access fields from its super class
//getFileds method will b used to get only public fields and including inherited
public class FieldAPI {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, NoSuchMethodException {

		//to get class Fields
		Class<?> cls = Person.class;
		Class<?> empcls = Employee.class;
		Field age = cls.getField("age");
		Field[] fields = cls.getDeclaredFields();
		
		for(Field field:fields) {
			System.out.println("getDeclaredFields Field name is= "+field.getName());
		}
		
		Field[] flds = empcls.getFields();
		
		for(Field field:flds) {
			System.out.println("getFields Field name is= "+field.getName());
		}
		
		//to get class Methods
		
		Method md = cls.getMethod("setName", String.class);
		Method[] methods = cls.getDeclaredMethods();
		Method[] mthds = cls.getMethods();
		
		for(Method method: methods) {
			System.out.println("getDeclaredMethods Method name is= "+method.getName());
		}
		//to get constructors of a class
		Constructor<?> cons = cls.getConstructor(Person.class);
		Constructor<?>[] constructors = cls.getConstructors();
		Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
		
		for(Constructor<?> constructor: declaredConstructors) {
			System.out.println("getDeclaredConstructors name is= "+ constructor.getName()+"|| parameter count is="+constructor.getParameterCount());
		}
		for(Constructor<?> constructor: constructors) {
			System.out.println("getConstructors name is= "+ constructor.getName()+"|| parameter count is="+constructor.getParameterCount());
		}
		
	}

}
