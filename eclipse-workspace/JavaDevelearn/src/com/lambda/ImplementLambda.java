package com.lambda;

public class ImplementLambda {
	
	public void demo() { // This method is local to this class itself
		LambdaDemo lm2 = new LambdaDemo() {
			
			@Override
			public void demo() {  // This is the overrided method of Demon_1 interface.
				System.out.println("System Demo");
				
			}
		};
		lm2.demo();
	}
	
	public static void main(String[] args) {
		LambdaDemo lm1 = new LambdaDemo() {
			
			public void demo() {
				System.out.println("Demo Executed");
			}
		};
		lm1.demo();
		Demon_1 d1 = (a,b)->{
			return a+b;
		};
		System.out.println(d1.add(23, 59));
		ImplementLambda ll = new ImplementLambda();
		ll.demo();
	}
}
