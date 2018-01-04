package InterfaceBankEx;

public class TestInterface 
{
	public static void main(String[] args)
	{
		Bank x=new PNBBank();
		System.out.println("Rate Of Interest is "+x.RateOfInterest());
	}
}
