import java.util.Scanner;

public class PairProcess {
	public static void main(String[] args) {
		int num1, num2;
		int sum, product;
		double average;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "First Number? :" );
		num1 = keyboard.nextInt();
		
		System.out.print( "Last Number?  :" );
		num2 = keyboard.nextInt();

		sum = num1 + num2;
		product = num1 * num2;
		average = (double)sum / 2;
		
		if (sum > 200) {
			System.out.println("sum = " + sum + "*");
		} else {
			System.out.println("sum = " + sum);
		}
		System.out.println("product = " + product);
		System.out.println("average = " + average);
	}
}