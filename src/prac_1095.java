import java.util.*;

public class prac_1095 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int arr[] = new int[n+m];
		int count = 0;
		
		for(int i=0;i<n+m;i++) {
			arr[i] = s.nextInt();
		}
		
		for(int j=0;j<n;j++) {
			int temp = arr[j];
			for(int k=n;k<n+m;k++) {
				if(temp == arr[k])
					count++;
			}
		}
		System.out.println(count);
	}
}
