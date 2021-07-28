package ExceptionHandling;

import java.util.Random;

public class HandlingException {

	public static void main(String[] args) throws Exception {
		
		//login 
		Thread.sleep(3000);
		//operation is going on
		try
		{
			int i=100;
			int result=i/10;
			System.out.println(result);
			
			String name="prasanth";
			System.out.println(name.charAt(20));
			//100 lines of code
			//adding,subtraction
			//string operations
			Thread.sleep(3000);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("exception occured  "+ae);
		}
		catch(StringIndexOutOfBoundsException se)
		{
			System.out.println("exception occured  "+se);
		} 
		catch(Exception message)
		{
			System.out.println("exception occured "+message);
		}
		finally
		{
			System.out.println("logged out from the application");
		}
		
	}
}





