import java.util.Scanner;

public class prac_1012 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		long a = s.nextInt();
		long b = s.nextInt();
		System.out.println(a*b);
		
		//곱하기 연산을 할 때 주의해야 할 점은 값의 표현 범위를 넘지 않는지 점검하는 것!
		//계산전에 int형보다 더 큰 long형으로 저장해서 계산할 필요가 있다.
	}
}