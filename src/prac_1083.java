import java.util.*;

public class prac_1083 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt(); //수열의 길이
		int arr[] = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = s.nextInt();
		} //값 입력
		int a = s.nextInt();
		int b = s.nextInt();
		int count = 0;
		
		if(a>b) {
			int tmp = a;
			a = b;
			b = tmp;
		} //a에 항상 작은 값 넣기
		
		for(int j=0;j<N;j++) {
			if(arr[j] == a || arr[j] == b || (arr[j] > a && arr[j] < b))
				count++;
		}
		
		System.out.println(count);
	}
}
