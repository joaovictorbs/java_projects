package util;

public class CurrencyConverter {
	
	public static final double IOF = 6.0;
	
	public static double calculate(double dolarPrice, double dolarQuantity) {
		
		double iofTax = IOF / 100.0;
		double totalValue = dolarQuantity * dolarPrice  * (1 + iofTax);
		
		return totalValue;
	} 
}
