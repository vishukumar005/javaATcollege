import java.util.*;
class Prime {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter range: ");
		int n = sc.nextInt(), flag;
		System.out.print("Prime In range: ");
		for(int i = 1; i<= n; i++) {
			flag = 0;
			if(i == 1) {
				continue;
			}
			for(int j = 2; j<= i/2; j++) {
				if(i % j == 0) {
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				System.out.print(i+" ");
			}
		}
		
	}
}