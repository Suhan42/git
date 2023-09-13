package createThread;

public  class MyRun2 implements Runnable {
	@Override
	public void run() {
		try {
			for(int i=0; i<10; i++) {
				System.out.println("tttt");
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
