package practice.multithreaded;

class ATM {
	synchronized public void checkBalance(String name) {
		System.out.println(name + " Checking ");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {}
		System.out.println("Balance");
	}

	synchronized public void withDraw(String name, long amount) {
		System.out.println(name+" Withdrawing ");
		try {
			Thread.sleep(1000);
		} catch(Exception e) {}
		System.out.println(amount);
	}

}

class Customer extends Thread{
	ATM atm;
	String name;
	long amount;

	Customer(String n,ATM a,int amt) {
		name = n;
		atm = a;
		amount = amt;
	}

	// ATM method
	public void useATM() {
		atm.checkBalance(name);
		atm.withDraw(name, amount);
	}

	public void run() {
		useATM();
	}
}


public class SCThread1 {
	public static void main(String[] args) {
		ATM atm = new ATM();
		Customer c1 = new Customer("Smith",atm,100);
		Customer c2 = new Customer("John",atm,200);
		c1.start();
		c2.start();
	}
}
