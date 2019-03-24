import java.util.Scanner;

public class prac_1016 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		long a = s.nextInt();
		long b = s.nextInt();
		System.out.println(a > b ? a : b);
	}
}