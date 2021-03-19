package com.advanced.enums;

public enum Levels {
	LOW("L"),
	MEDIUM("M"),
	HIGH("H");
public final String value;
	Levels(String value){
		this.value=value;
		
	}
	public String value(){
		return value;
	}

}
