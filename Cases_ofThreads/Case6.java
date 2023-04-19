// When we call start() method on thread, it internally calls run() method by default with 
//newly created thread. SO, if we override start() method, run() method will not called
//until we write code for run() method.

//  so if we override start() method  then out start() method will be executed just like a normal
//method call without creating any new Thread.

//**which is entire program will produce by single main Thread

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
