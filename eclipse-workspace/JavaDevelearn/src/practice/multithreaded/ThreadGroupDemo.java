package practice.multithreaded;

public class ThreadGroupDemo implements Runnable{
	public void demo() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			System.out.println("Demo was Called "+i);
			Thread.sleep(200);
		}
	}
	public void show() throws InterruptedException {
		for(int i = 0;i < 5; i++) {
			System.out.println("Show was Calling "+i);
			Thread.sleep(200);
		}
	}
	public void run() {
		System.out.println("Thread was executed : ");
		for(int i = 0;i < 5;i++) {
			System.out.println("Executed : "+Thread.currentThread().toString()+" "+i);
			System.out.println();
			//			System.out.println("Executed : "+Thread.currentThread().getThreadGroup());
			try {
				Thread.sleep(300);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {

		ThreadGroup tg = new ThreadGroup("Gr1");
		Thread t1 = new Thread(tg,new ThreadGroupDemo(),"one");
		Thread t2 = new Thread(tg,new ThreadGroupDemo(),"two");
		Thread t3 = new Thread(tg,new ThreadGroupDemo(),"three");
		tg.setMaxPriority(8);
		t1.start();
		try {
			t1.wait(20000);
//			t1.join(300);
		} catch(Exception e) {
			e.printStackTrace();
		}
		t2.start();
		t3.start();
		//		t1.interrupt();
		System.out.println("Thread Group Name: "+tg.getName());
	}
}
