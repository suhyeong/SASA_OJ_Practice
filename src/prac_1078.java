import java.util.*;

public class prac_1078 {
	public static void main(String args[]) {
				Scanner s = new Scanner(System.in);
				int x = s.nextInt();
				int arr[][] = new int[x][x];
				int num = 1;
				
				for(int i=0;i<x;i++) {
					for(int j=0;j<x;j++) {
						arr[i][j] = num++; 
					}
				}
				
				for(int k=x-1;k>=0;k--) {
					for(int l=x-1;l>=0;l--) {
						System.out.print(arr[k][l]+" ");
					}
					System.out.println();
				}
	}
}
