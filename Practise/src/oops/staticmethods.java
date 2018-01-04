package oops;

public class staticmethods {

	public static void method1()
	{
		System.out.println("method 1");
	}
	public static void method2(int a)
	{
		System.out.println(a);
	}
	public static boolean method3()
	{
		return true;
	}
	public static int method4(int a, int b)
	{
		return a+b;
	}
	
	public static void main(String[] x)
	{
		//way 1
		method1();
	
	
	//way 2
	staticmethods.method2(10);
	
	boolean r=staticmethods.method3();
	System.out.println(r);
	
	int r1=staticmethods.method4(10,20);
	System.out.println(r1);
	
	
	
	
	
	
}}
