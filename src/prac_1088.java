import java.util.*;

public class prac_1088 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt(); //�Է¹��� ���� ����
		int arr[] = new int[N]; //�Է¹��� ���� ���� �迭
		for(int i=0;i<N;i++)
			arr[i] = s.nextInt(); //�迭�� ���� �Է�
		int K = s.nextInt(); //K��°�� ū ���� ���
		Arrays.sort(arr);
		System.out.println(arr[N-K]);
	}
}
