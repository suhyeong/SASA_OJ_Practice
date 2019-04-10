import java.util.*;

public class prac_1087 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String[] a = new String[5];
		String[] b = new String[5];
		
		for(int i=0;i<5;i++) {
			a[i] = s.nextLine();
		}
		for(int j=0;j<5;j++) {
			b[j] = s.nextLine();
		}
		
		System.out.println(Arrays.equals(a, b));
	}
}
