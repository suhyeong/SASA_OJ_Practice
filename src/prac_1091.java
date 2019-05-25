import java.util.*;

public class prac_1091 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		ArrayList instruction = new ArrayList();
		ArrayList list = new ArrayList();
		
		while(true) {
			String ins = s.next();
			if(!ins.equals("PRINT")) {
				instruction.add(ins);
			}
			else
				break;
		}
		
		for(int i=0;i<instruction.size();i++) {
			if(instruction.get(i).equals("ADD"))
				list.add(instruction.get(i+1));
			else if(instruction.get(i).equals("REMOVE")) {
				for(int k=0;k<list.size();k++) {
					if(list.get(k).equals(instruction.get(i+1)))
						list.remove(k);
				}
			}
		}
		
		System.out.print("[");
		for(int j=0;j<list.size();j++) {
			if(j == list.size()-1)
				System.out.print(list.get(j));
			else
				System.out.print(list.get(j)+", ");
		}
		System.out.print("]");
	}
}
