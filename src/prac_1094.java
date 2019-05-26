import java.util.ArrayList;
import java.util.Scanner;

public class prac_1094 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		ArrayList instruction = new ArrayList();
		ArrayList list = new ArrayList();
		
		while(true) {
			String ins = s.next();
			if(ins.equals("ADD")) {
				list.add(s.next());
			} else if(ins.equals("REMOVE")) {
				String z = s.next();
				for(int k=0;k<list.size();k++) {
					if(list.get(k).equals(z))
						list.remove(k);
				}
			} else if(ins.equals("SET")) {
				String str = s.next();
				String str2 = s.next();
				for(int k=0;k<list.size();k++) {
					if(list.get(k).equals(str))
						list.set(k, str2);
				}
			} else if(ins.equals("BOARD")) {
				if(list.size() > 3) {
					for(int k=0;k<4;k++) {
						System.out.print(list.get(0)+" ");
						list.remove(0);
					}
				} else { 
					int size = list.size();
					for(int q=0;q<size;q++) {
						System.out.print(list.get(0)+" ");
						list.remove(0);
					}
				}
				System.out.println();
			} else if(ins.equals("WAIT")) {
				if(list.size() == 0) {
					System.out.println(list.size()+"people");
					System.out.println("Program End");
					break;
				} else {
					System.out.println(list.size()+"people");
				}
			}
		}
	}
}
