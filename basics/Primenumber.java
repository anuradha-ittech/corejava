import java.util.Scanner;

public class Primenumber {
	public static void main(String args[]) {
		int mode = 0, flag = 0, n;
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		if (n == 0 || n == 1) {
			System.out.println(" the given number is not prime number,");

		} else {
			mode = n / 2;
			for (int i = 2; i <= mode; i++) {
				if (n % i == 0) {
					flag = 1;
					break;

				}
			}
			if (flag == 1) {
				System.out.println("the given number is not a prime number,");

			} else {
				System.out.println("the givn number is prime number,");
			}
		}
		sc.close();
	}
}
