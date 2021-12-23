package com.javatechie.singleton_design_pattern;

import java.io.Serializable;

public class LazySingleton extends MyClone implements Serializable{
	private static LazySingleton instance = null;
	private LazySingleton() {
		if (instance != null) {
			throw new IllegalStateException("Object can't be created using reflection");
		}
	}
	
	public static synchronized LazySingleton getInstance() {
		if (instance == null) {
			return instance =  new LazySingleton();
		}
		return instance;
	}

	private Object readResolve() {
		return instance;

	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
		// or we can return the same object 
		// return instance;
	}
}
