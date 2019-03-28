import java.util.*;

public class prac_1065 {
	public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
	int x = s.nextInt();
	
	String oct = Integer.toOctalString(x);
	String hex = Integer.toHexString(x);
	
	System.out.println(x +" "+ oct +" "+ hex);
	}
}