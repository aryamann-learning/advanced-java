package com.advanced.serialization;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PassingMessage implements Serializable {
public String message;
public PassingMessage(String message){
	this.message = message;
}

}
