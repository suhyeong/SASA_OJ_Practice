import java.util.*;

public class prac_1084 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt(); //������ ����
		int arr[] = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = s.nextInt();
		} //�� �Է�
		int x = s.nextInt(); //�� ���� �ԷµǴ� Ƚ��
		x = x*2;
		int numarr[] = new int[x];
		for(int j=0;j<x;j++) {
			numarr[j] = s.nextInt();
		}
		int count[] = new int[x];

		for(int k=0;k<N;k++) {
			for(int l=0;l<x;l+=2) {
				if(arr[k] == numarr[l] || arr[k] == numarr[l+1] || (arr[k] > numarr[l] && arr[k] < numarr[l+1]))
					count[l]++;
			}
		}
		
		for(int z=0;z<x;z++) {
			if(z%2 == 0)
				System.out.println(count[z]);
		}
	}
}
