import java.util.Scanner;
class Factorial {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int fact = 1;
		for(int i = 1; i<= num; i++) {
			fact *= i;
		}
		System.out.println("factorial = "+fact);
	}
}