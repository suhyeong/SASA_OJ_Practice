import java.util.*;

public class prac_1073 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String phonenum = s.nextLine();
		int count = 0;
		
		for(int i=0;i<phonenum.length();i++) {
			char ch = phonenum.charAt(i);
			if(ch == '0')
				count++;
		}
		System.out.println(count);
	}
}
