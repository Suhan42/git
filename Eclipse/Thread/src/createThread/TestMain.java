package createThread;


/**
 * 创建线程（thread）*/

public class TestMain {
	public static void main(String[] args) {
		Thread t = new Thread(new Myrun());
		t.start();
		
		//2.使用匿名类创建
		Thread t2 = new Thread(new Runnable(){
			@Override
			public void run() {
				try {
					for(int i=0; i<10; i++) {
						System.out.println("aaa");
						Thread.sleep(1000);
					}
				}catch(Exception e) {
					e.printStackTrace();
				}	
			}
		});
		t2.start();
		
		
		//3.使用一般类创建
		Thread t3 = new Thread(new MyRun2());
		t3.start();
		
		
		//4.使用Thread的继承类来创建
		MyThread t4 = new MyThread();
		t4.start();
	}
	
	//1.使用内部类的方法来创建
	static class Myrun implements Runnable{
		public void run() {
			try {
				for(int i=0; i<10; i++) {
					System.out.println("ff");
					Thread.sleep(1000);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
	}
	
}
