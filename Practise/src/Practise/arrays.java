package Practise;

public class arrays {
public static void main(String[] args)
{
	//int
	int[] a=new int[3];
	a[0]=10;
	a[1]=20;
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a.length);
	System.out.println("");
	
	//int
	int[] b= {10,20,30,40};
	System.out.println(b[0]);
	System.out.println(b[1]);
	System.out.println(b.length);
	System.out.println("");
	
	//both string and int
	Object[] c= {10,"hi","hello"};
	System.out.println(c[0]);
	System.out.println(c[1]);
	System.out.println(c.length);
	System.out.println("");
	
	//string
	String[] d= {"ha","hi","hello"};
	System.out.println(d[0]);
	System.out.println(d[1]);
	System.out.println(d.length);
	System.out.println(" ");
	
	//for loop
	Object[] e= {10,"he","she"};
	for(int i=0;i<e.length;i++)
	{
		System.out.println(e[i]);
	}
	System.out.println();	
	
	//while loop
	int i=1;
	while(i<=5)
	{
	System.out.println(i);
	i++;
	}
	System.out.println();
	
	//do while
		int f=1;
		do {
		System.out.println("Value is:"+f);
		f++;
		}
		while(f<=5);
		System.out.println();
		
		//printing given o/p
		int[] g= {10,20,30,40,50};
		for(int h:g) 
		{
			System.out.println(h);
		}
		System.out.println();
		

}
	}