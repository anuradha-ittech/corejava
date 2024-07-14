import java.util.Scanner;

public class Calculation {

	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter two numbers:");
	    int m = sc.nextInt();
	    int n = sc.nextInt();
	    int sum = m+n;
		System.out.println("Sum="+sum);
		sc.close();
	  }
}
