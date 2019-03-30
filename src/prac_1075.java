import java.util.*;

public class prac_1075 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int arr[][] = new int[x][x];
		int num = 1;
		
		for(int i=0;i<x;i++) {
			for(int j=0;j<x;j++) {
				arr[i][j] += num++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
