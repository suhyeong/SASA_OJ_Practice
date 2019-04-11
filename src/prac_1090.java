import java.util.*;

public class prac_1090 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt(); //학생 수
		int arr[] = new int[N+1]; //N명의 키
		if(N >= 1 || N <= 100) {
			for(int i=0;i<arr.length;i++) {
				arr[i] = s.nextInt();
			} //학생 키 입력
		}
		int sejongslength = arr[N]; //세종의 키  입력
		Arrays.sort(arr);
		int index = 0;
		for(int j=0;j<arr.length;j++) {
			if(arr[j] == sejongslength) {
				index = j;
			}
		}
		
		System.out.println(N-index+1);
	}
}
