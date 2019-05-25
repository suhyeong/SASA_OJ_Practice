import java.util.*;

public class prac_1045 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int sum = 0;
		for(int i=1;i<=x;i++) {
			if((i%2)==0)
				sum += i;
		}
		
		System.out.println(sum);
	}
}
