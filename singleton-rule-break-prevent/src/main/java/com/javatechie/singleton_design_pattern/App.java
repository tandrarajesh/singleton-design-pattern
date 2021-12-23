package com.javatechie.singleton_design_pattern;

public class App {

	public static void main(String[] args) throws CloneNotSupportedException {
		LazySingleton lazySingleton1 = LazySingleton.getInstance();
		System.out.println("lazySingleton1hash code:  "+ lazySingleton1.hashCode());
		LazySingleton lazySingleton2 = (LazySingleton) lazySingleton1.clone();
		System.out.println("lazySingleton2hash code:  "+ lazySingleton2.hashCode());
	}
}
