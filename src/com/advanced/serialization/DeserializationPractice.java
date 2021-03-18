package com.advanced.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationPractice {
	public static void main(String[] args) throws ClassNotFoundException {
		PassingMessage obj = null;
		String filename = "AryaPractice.ser";
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream object = new ObjectInputStream(file);
			obj = (PassingMessage) object.readObject();
			object.close();
			file.close();
			System.out.println("object has been deserialization");
			System.out.println("Message =" + obj.message);
		} catch (IOException e) {
			System.out.println("exception found");
		}

	}

}
