import java.util.Scanner;

public class prac_1015 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		if(a >= b)
			System.out.println(true);
		else
			System.out.println(false);
	}
}