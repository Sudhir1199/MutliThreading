//here we use super.start() which calls Parent Thread class start() method
// which invokes zero paramether run() method by default 

____> main thread_____> main thread, Start Threa
                 ______>run thread(child thread)




class MyThread extends Thread{
	@Override
	public  void start() {
		// TODO Auto-generated method stub
		super.start();
		System.out.println("Start Method");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run method");
	}

}
public class Case7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t = new MyThread();
		t.start();
		System.out.println("main method");
		

		
	}

}

