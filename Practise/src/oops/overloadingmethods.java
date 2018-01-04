package oops;

public class overloadingmethods {

	public void method1()
	{
		System.out.println("method1");	
	}
	public void method1(Long a)
	{
		System.out.println(a);
	}
	public void method1(String a)
	{
		System.out.println(a);
	}
	public void method1(String a,String b)
	{
		System.out.println(a+b);
	}
	public void method1(int a,int b)
	{
		System.out.println(a-b);
	}
	
	
	public static void main(String[] args)
	{
		overloadingmethods x= new overloadingmethods();
		x.method1(999999999,111111111);
	}











}
