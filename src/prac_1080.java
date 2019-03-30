import java.util.*;

public class prac_1080 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int N; //정수 개수
		N = s.nextInt();
		int arr[] = new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i] = s.nextInt();
		}
		
		for(int j=N-1;j>=0;j--) {
			System.out.print(arr[j]+" ");
		}
	}
}
