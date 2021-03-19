package com.advanced.enums;

public class MainOne {
	public static void main(String[] args) {
		System.out.println(Sizes.SMALL.value);
		System.out.println(Sizes.SMALL.name());
		Sizes[] values = Sizes.values();
		for (Sizes size : values) {
			System.out.println(size.name() + "=" + size.value());
		}

	}
}
