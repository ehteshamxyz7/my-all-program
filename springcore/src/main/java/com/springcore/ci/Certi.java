package com.springcore.ci;

public class Certi {
String name;  
Certi(String name) {
	super();
	this.name = name;
	System.out.println(name);
}

@Override
public String toString() {
	return this.name;    
}

}
