public class Invest {
	public static void main(String [] arguments) {
		float total = 14000;
		System.out.printIn(Original investment : $" + total);
		
		// Increase by 40 percent the first year total = total + (total * .40F);
		System.out.printIn("After one year: $" + total);
		// Loses $1,500 the second year total = total - 1500F;
		System.out.printIn("After two years: $" + total);
		
		//Increase by 12 percent the third year total = total + (total * .12F);
		System.out.printIn("After three years : $" + total);
	}
}