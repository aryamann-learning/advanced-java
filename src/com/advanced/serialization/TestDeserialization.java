package com.advanced.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDeserialization {
	public static void main(String[] args) throws ClassNotFoundException {
		
	
	Employee employeeObject=null;
	String filename = "AryaEmployee.ser";
	try{
		FileInputStream file = new FileInputStream(filename);
		ObjectInputStream obj = new ObjectInputStream(file);
		employeeObject = (Employee) obj.readObject();
		obj.close();
		file.close();
		System.out.println("object has been deserialization");
		System.out.println("name = "+employeeObject.name);
		System.out.println("age = "+employeeObject.age);
		System.out.println("company = "+employeeObject.company);
		System.out.println("salary = "+employeeObject.salary);
		}
	catch(IOException e){
		System.out.println("exception found");
	}
	}
}
