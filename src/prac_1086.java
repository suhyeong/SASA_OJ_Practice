import java.util.*;

public class prac_1086 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i=0;i<10;i++) {
			arr[i] = s.nextInt();
		}
		int N = s.nextInt();
		if(Arrays.binarySearch(arr, N) >= 0) {
			System.out.println(Arrays.binarySearch(arr, N)+1);
		} else
			System.out.println(-1);
	}
}
