class A extends Thread 
{
	public void run()
	{
		for(int i=0;i<=50;i++)
		{
			try
			{
				System.out.println(Thread.currentThread().getName()+": "+i);
				
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
			}
		}
	}
}
public class Demo 
{
	public static void main(String[] args) 
	{
		A a =new A();
		Thread t1=new Thread(a);
		Thread t2=new Thread(a);
		t1.start();
		t2.start();
		t1.setName("Rama");
		t2.setName("Seetha");

		for(int k=0;k<=50;k++)
		{
			try
			{

				if(k==5)
					t1.suspend();
				if(k==10)
					t1.resume();
				if(k==14)
					System.out.println(t1.isAlive());

				if(k==20)
					t1.stop();

				if(k==25)
					System.out.println(t1.isAlive());
				
				System.out.println("		k  : "+k);
				Thread.sleep(1000);
			}
			catch(Exception e){}
		}
	}
}

	run 
	start
	setNAME
	GETNAME
	SetP
	getP
	isAlive 
	Thered.currentThed
	suspnd
	resume 
	stop
	wait 
	synchd
	sleep
	


