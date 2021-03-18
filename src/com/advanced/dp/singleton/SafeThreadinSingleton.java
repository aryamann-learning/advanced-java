package com.advanced.dp.singleton;

public class SafeThreadinSingleton {
	private static SafeThreadinSingleton obj=null;
	private SafeThreadinSingleton(){
		
	}
	synchronized public static SafeThreadinSingleton getInstance(){                  /*here we are using synchronized keyword to get safe programming
		                                                                             in the purpose of threading*/
		if(obj==null){                                                                
			obj = new SafeThreadinSingleton();
			
		}
		return obj;
		
	}

}
