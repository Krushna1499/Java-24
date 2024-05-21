package Exception;

public class ExceptionMeth2 {

	public static void main(String[] args) {
		try
		{
		int A[] = {10,0,5,8,98,6};
		try
		{
			int r;
			r = A[0]/A[1];
			System.out.println(r);
		}
		catch(ArithmeticException s)
		{
			System.out.println(s);
		}
			System.out.println(A[10]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
	}
}

