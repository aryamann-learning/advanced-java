package com.advanced.enums;

public class MainTwo {
	public static void main(String[] args) {
		Levels[] values = Levels.values();
		for (Levels level : values) {
			System.out.println(level.name() + "=" + level.value());
		}

	}

}
