import java.util.*;

public class prac_1097 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt(); //������ ����
		int x = s.nextInt(); //ã���� �ϴ� ��
		int arr[] = new int[N];
		int index = 0;
		for(int i=0;i<arr.length;i++) {
			arr[i] = s.nextInt();
		}
		for(int j=0;j<arr.length;j++) {
			if(arr[j] >= x) {
				index = j;
				break;
			}
			else if(x > arr[arr.length-1])
				index = N;
		}
		System.out.println(index+1);
	}
}
