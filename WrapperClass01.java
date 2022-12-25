package com.keywords;

public class WrapperClass01 {

	public static void main(String[] args) {
		
		short d = 20; // primitive Data Type
		
		Short s = new Short(d); // Autoboxing
		System.out.println("Primitive Datatype value converted into object value :"+ s); 
		
		short g = s.shortValue(); // Unboxing
		System.out.println("Object value converted into Primitive Datatype :"+g);

	}

}
