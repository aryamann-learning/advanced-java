package com.advanced.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationPractice {
	public static void main(String[] args) {
		PassingMessage obj = new PassingMessage("I have class i am not coming out");
		String filename = "AryaPractice.ser";
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream object = new ObjectOutputStream(file);
			object.writeObject(obj);
			object.close();
			file.close();
			System.out.println("Object has been serialized");
		} catch (IOException e) {
			System.out.println("Exception Found");
		}
	}

}
