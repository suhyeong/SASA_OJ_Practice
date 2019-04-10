import java.util.*;

public class prac_1088 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt(); //입력받을 정수 갯수
		int arr[] = new int[N]; //입력받을 정수 저장 배열
		for(int i=0;i<N;i++)
			arr[i] = s.nextInt(); //배열에 숫자 입력
		int K = s.nextInt(); //K번째로 큰 정수 출력
		Arrays.sort(arr);
		System.out.println(arr[N-K]);
	}
}
