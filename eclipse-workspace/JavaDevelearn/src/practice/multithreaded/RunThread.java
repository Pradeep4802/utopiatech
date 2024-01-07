package practice.multithreaded;

public class RunThread implements Runnable{
	public void demo() {
		System.out.println("Demo was initialized...");
	}
	
	public void run() {
		for(int i = 0;i < 5;i++ ) {
			System.out.print(i + " ");
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		RunThread rt = new RunThread();
		Thread th = new Thread(rt);
		th.start();
		rt.demo();
		
	}
}
