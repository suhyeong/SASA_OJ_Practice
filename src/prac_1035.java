import java.util.*;

public class prac_1035 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		if((a >= 90) && (a <= 100))
			System.out.println("A");
		else if((a>=70) && (a<=89))
			System.out.println("B");
		else if((a>=40) && (a<=69))
			System.out.println("C");
		else if((a>=0) && (a<=39))
			System.out.println("D");
	}
}
