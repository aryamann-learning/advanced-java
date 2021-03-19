package com.advanced.enums;

public enum Sizes {
	SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRALARGE("XL");

	public final String value;

	Sizes(String value) {
		this.value = value;
	}

	public String value() {
		return value;
	}


}
