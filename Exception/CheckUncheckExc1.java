package Exception;

	class NegativeDimensionException extends Exception
	{
		public String toString()
		{
			return "Diamension Of rectangle cannot be Negative";
		}
	}
public class CheckUncheckExc1 {
	
	static int area(int l, int b) throws NegativeDimensionException
	{
		if(l<0 || b<0)
		throw new NegativeDimensionException();
		return l*b;
	}
	static void meth1() throws NegativeDimensionException
	{
		System.out.println("Area is "+area(-10,5));
	}
	

	public static void main(String[] args)  {
		try {
			meth1();
		} catch (NegativeDimensionException e) {
			System.out.println(e);
			//e.printStackTrace();
		}
	}

}
