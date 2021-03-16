package com.advanced.dp.singleton;

public class Singleton {
	private static Singleton obj = null;

	private Singleton() {
	}

	public static Singleton getInstance() {

		// create object if it's not already created
		if (obj == null) {
			obj = new Singleton();
		}

		// returns the singleton object
		return obj;
	}

}
