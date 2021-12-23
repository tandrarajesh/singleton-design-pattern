package com.javatechie.singleton_design_pattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class AppSerialization {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		LazySingleton lazySingleton1 = LazySingleton.getInstance();
		System.out.println("lazySingleton1hash code:  "+ lazySingleton1.hashCode());
		
		// Serialize singleton object to a file
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
		out.writeObject(lazySingleton1);
		out.close();
		
		//Deserilize singleton object from a file
		ObjectInput input = new ObjectInputStream(new FileInputStream("singleton.ser"));
		LazySingleton lazySingleton2 = (LazySingleton) input.readObject();
		input.close();
		
		System.out.println("lazySingleton2hash code:  "+ lazySingleton2.hashCode());
	}
}
