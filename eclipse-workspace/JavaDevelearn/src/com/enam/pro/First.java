package com.enam.pro;

enum Month{February,January,March,April,May,JUn}

public class First {

	enum Color{Red,Green,Blue,Black};
	
	public static void main(String[] args) {
		
		Color x=Color.Black;
		System.out.println(x);
		Month m=Month.April;
		System.out.println(m);
		
		for(Color a:Color.values()) {
			System.out.println(a);
		}
		System.out.println("-------------------");
		for(Days mn : Days.values()) {
			System.out.println(mn);
		}
		System.out.println("-------------------");
		
		// Enum Days uses
		Days.meth1();
		System.out.println(Days.k);
		
		Days dd = Days.valueOf("TuesDay");
		String str = dd.toString();
		int ordinal = dd.ordinal();
		
		System.out.println(ordinal);
	}
}
