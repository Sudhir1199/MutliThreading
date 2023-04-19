// If we are not ovverriding run() method then Thread class run() method will be executed 
// which has empty implementation and hence we won't get any output


class MyThread extends Thread{
	
}
public class Case4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t = new MyThread();
		t.start();

	}

}
