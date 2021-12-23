package com.javatechie.singleton_design_pattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AppReflection {
	public static void main(String[] args) throws CloneNotSupportedException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		LazySingleton lazySingleton1 = LazySingleton.getInstance();
		System.out.println("lazySingleton1hash code:  "+ lazySingleton1.hashCode());
		
		LazySingleton reflectionInstance = null;
		
		Constructor[] constructors = LazySingleton.class.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			constructor.setAccessible(true);
			reflectionInstance  = (LazySingleton) constructor.newInstance();
		}
		
		System.out.println("reflectionInstance code:  "+ reflectionInstance.hashCode());
	}
}
