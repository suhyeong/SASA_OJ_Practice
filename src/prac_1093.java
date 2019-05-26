import java.util.ArrayList;
import java.util.Scanner;

public class prac_1093 {
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
			} else if(instruction.get(i).equals("SET")) {
				for(int k=0;k<list.size();k++) {
					if(list.get(k).equals(instruction.get(i+1)))
						list.set(k, instruction.get(i+2));
				}
			}
		}
		
		System.out.println(list.size());
		for(int j=0;j<list.size();j++) {
			System.out.print(list.get(j)+" ");
			if((j%4)==3)
				System.out.println();
		}
	}
}
