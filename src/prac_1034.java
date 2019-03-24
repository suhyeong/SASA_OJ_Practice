import java.util.*;

public class prac_1034 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		if(a > 0)
			System.out.println("plus");
		else
			System.out.println("minus");
		if(a%2 == 0)
			System.out.println("even");
		else
			System.out.println("odd");
	}
}
