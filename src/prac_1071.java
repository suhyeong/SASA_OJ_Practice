import java.util.*;

public class prac_1071 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int arr[] = new int[5];
		int sum = 0;
		int i=0;
		do {
			arr[i] = s.nextInt();
			if(arr[i] <= 0)
				continue;
			sum += arr[i];
			i++;
		} while(i<5);
		System.out.println(sum);
	}
}
