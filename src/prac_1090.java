import java.util.*;

public class prac_1090 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt(); //�л� ��
		int arr[] = new int[N+1]; //N���� Ű
		if(N >= 1 || N <= 100) {
			for(int i=0;i<arr.length;i++) {
				arr[i] = s.nextInt();
			} //�л� Ű �Է�
		}
		int sejongslength = arr[N]; //������ Ű  �Է�
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
