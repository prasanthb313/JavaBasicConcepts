package BasicInJava;

import java.util.Scanner;

public class BookingBusTicket {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Do you want to check the list of busses available to Nellore");
		
		String status=scan.nextLine();
		
		if(status.equalsIgnoreCase("yes"))
		{
			System.out.println("1) Red Bus "+"\n"+"2) RTC"	);
		}
		else {
			System.out.println("please enter yes option to see the list of busses available to Nellore");
		}
		
		System.out.println("please enter the time you want to capture the bus");
		
		int time=scan.nextInt();
		
		if(time<=9)
		{
			System.out.println("Both RTC and Red bus are available at the time slot u entered "+time);
		}
		else
		{
			System.out.println("No bussses at this time");
		}
		
		
		
	}
}
