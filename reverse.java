import java.util.Scanner;
class Reverse {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int cpy = num, reverse = 0;
		while(cpy != 0) {
			int lastDigit = cpy % 10;
			reverse = reverse * 10 + lastDigit ;
			cpy /= 10;
		}
		System.out.print("Reverse= "+reverse);
	}
}