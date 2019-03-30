import java.util.*;

public class prac_1074 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		
		for(int i=x;i<=y;i++) {
			System.out.println(i+"´Ü");
			for(int j=1;j<=9;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}
}
