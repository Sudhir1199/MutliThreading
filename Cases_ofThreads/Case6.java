
class MyThread extends Thread{
	@Override
	public  void start() {
		// TODO Auto-generated method stub
		System.out.println("Start Method");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run method");
	}

}
public class Case6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t = new MyThread();
		t.start();
		System.out.println("main method");
		

		
	}

}
