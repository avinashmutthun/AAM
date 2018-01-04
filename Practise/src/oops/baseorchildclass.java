package oops;

public class baseorchildclass extends superorparentclass
{
	public void method3()
	{
		System.out.println("Mr. Pumpkin");
	}
	
	public static void main(String[] args)
	{
		baseorchildclass x=new baseorchildclass();
		x.method1();
		x.method2();
		x.method3();
		
	}

}
