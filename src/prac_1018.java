import java.util.*;

public class prac_1018 {
	public static void main(String argsp[]) {
		Scanner s = new Scanner(System.in);
		long a = s.nextInt();
		long b = s.nextLong();
		long c = s.nextLong();
		System.out.println((a > b ? a : b) < c ? c : (a > b ? a : b));
	}
}
