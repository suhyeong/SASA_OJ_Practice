import java.util.*;

public class prac_1072 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		int count = 0;
		
		if(x != y) { //x와 y가 다르면
			if((x+y)%2 == 0) { //짝수면
				if(x > y) { //x가 y보다 크면
					while(true) {
						x--;
						++count;
						y++;
						if(x == y)
							break;
					}
				} else { //y가 x보다 크면
					while(true) {
						y--;
						count++;
						x++;
						if(x == y)
							break;
					}
				}
			} else if((x+y)%2 != 0) { //홀수면
				if(x > y) {
					while(true) {
						if(x == y+1)
							break;
						x--;
						count++;
						y++;
						if(x == y+1)
							break;
					}
				} else {
					while(true) {
						if(y == x+1)
							break;
						y--;
						count++;
						x++;
						if(y == x+1)
							break;
					}
				}
			}
		} else if(x==y)
			count = 0;
		
		System.out.println(count);
	}
}
