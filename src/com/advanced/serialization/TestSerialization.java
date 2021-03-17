package com.advanced.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerialization {
	public static void main(String[] args) {
		Employee employeeObject = new Employee("Arya", "Anji Institute", 22, 20000);
		String filename = "AryaEmployee.ser";
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream object = new ObjectOutputStream(file);
			object.writeObject(employeeObject);
			object.close();
			file.close();
			System.out.println("object has been serialized");
		} catch (IOException e) {
			System.out.println("Exception found");
		}
	}

}
