package com.collection.framework;
import java.util.*;


public class VectorDemo {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(45);
		System.out.println(v);
		v.add(567);
		v.add("Java");
		v.add(true);
		v.add(9074.943);
		System.out.println(v);
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		
		Object  str[] = v.toArray();
		System.out.println("-------Enhance For loop--------");
		for (Object object : str) {			
			System.out.println(object);
		}
		
		System.out.println("Index of : "+v.indexOf("Java",1));
		v.setSize(20);
		System.out.println(v);
		v.trimToSize();
		System.out.println(v);
		
		System.out.println("----------------------");
		v.setElementAt("Ronaldo", 4);
		System.out.println(v);
		System.out.println("Element at : "+v.elementAt(3));
		System.out.println("get at : "+v.get(2));
		
		System.out.println("Hascode : "+v.hashCode());
	}
}
