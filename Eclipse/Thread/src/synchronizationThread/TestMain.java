package synchronizationThread;

import java.util.ArrayList;

public class TestMain {
	public static int ct = 0;
	public static Object o = new Object();
	
	public static void main(String[] args) {
		ArrayList<Thread> list = new ArrayList<Thread>();
		
		for(int i=0; i<1000; i++) {
			Thread t =new Thread(new MyRun());
			t.start();
			list.add(t);
		}
		for(Thread tt : list) {
			try {
				tt.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(ct);
		
	}
	
	
	//public static class synchronized MyRun implements Runnable{}
	//也可以在开头就加上关键字
	
	public static class MyRun implements Runnable{
		public void run(){
			synchronized(o) {
				int c=ct;
				try {
					//这里睡眠了5ms，在这时间里可能干了其他的，所以数据不在准确
					//为了防止这种问题的出现，使用Java Run中的同步机制synchronized
					Thread.sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ct = c+1;
			}
		}
	}
}
