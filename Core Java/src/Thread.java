
public class Thread implements Runnable{
public static void main(String args[])
{
	Deadlock d=new Deadlock();
	
	Thread t1=new Thread();
	
	Thread t2=new Thread();
	System.out.println("First Thread");
	t1.run();
	System.out.println("Second Thread");
	t2.run();

}

@Override
public void run() {
	// TODO Auto-generated method stub
	System.out.println("welcome to threads");
	System.out.println("Simple Example of Threads");
}
}
