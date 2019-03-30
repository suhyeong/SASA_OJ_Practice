import java.util.*;

public class prac_1076 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int arr[][] = new int[x][x];
		int num = 1;
		
		for(int i=0;i<x;i++) {
			for(int j=x-1;j>=0;j--) {
				arr[i][j] = num++;
			}
			for(int k=0;k<x;k++) {
				System.out.print(arr[i][k]+" ");
			}
			System.out.println();
		}
	}
}
