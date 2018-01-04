package practise1;

public class arguentsandreturns {


	//type1 no arg no ret
	void welcome()
	{
		System.out.println("hello");
	}
//type 2 only arg no ret
	void add(int a,int b)
	{
		int c;
		c = a+b;
		System.out.println("addition of:"+a+" &"+b+"is:"+c);
	}
	//type3 no args only return
	float mul()
	{
		int a=10, b= 3;
		float c = a % b;
		return c;
	}
	//type4 both 
	int div(int a,int b)
	{
		int c = a/b;
		return c;
	}
	public static void main(String[] args)
	{
		arguentsandreturns vin = new arguentsandreturns();
		vin.welcome();
		vin.add(2,4);
		float res2 = vin.mul();
		System.out.println(res2);
		int res = vin.div(10,2);
		System.out.println(res);
		int res1= res *2;
		System.out.println(res1);
		
	}
}

