
class MyThread extends Thread{
	public void run() {
		System.out.println("no arg method");
	}
	public void run(int i) {
		System.out.println("int arg method");
	}
	
}
public class Case5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t = new MyThread();
		t.start();
		t.run(10);
		

		
	}

}
