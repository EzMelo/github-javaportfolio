import java.util.Scanner;
public class CurrencyConverter {

	public static void main(String[] args) {
		
		Scanner u = new Scanner(System.in);
		
		//Converting between ZAR and USD
		//Current conversion rate: 1USD = 14,65 ZAR
		//Ask if converting from ZAR to USD/USD to ZAR
		//Example output = USD 00.00 is equivalent to ZAR 00.00
		// Bonus marks: allows multiple currencies (try add Pounds)
		double ZAR = 14.67; // global variable
		
		System.out.println("Enter the amount you want to convert: ");
		double amount = u.nextDouble();
		
		System.out.println("Are converting to USD or to ZAR? ");
		String currency = u.next();
		
		 
		
		if (currency.equals("ZAR"))
		{
			double zarAmount = amount * ZAR;
			System.out.print("Amount is R" + Math.round(zarAmount * 100.0) / 100.0);
		}
		else 
		{
			double usdAmount = amount/ZAR;
			System.out.print("Amount is " + Math.round(usdAmount * 100.0) / 100.0 + " dollars");
		}
		
		
		
		
		// TODO Auto-generated method stub

	}

}
