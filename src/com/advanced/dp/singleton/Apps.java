package com.advanced.dp.singleton;

public class Apps {
public static void main(String[] args) {
	/*Singleton obj=new Singleton();*/              /* Here singleton object is not created because we are allowed to create the object only single time that"s why 
	                                                  we call it as singleton so we kept its access modifier as private*/
	Normal object = new Normal();
	object.print();
}
}
