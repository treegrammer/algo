package bj.silver5;

import java.util.Scanner;

public class Main_2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		String[] ca = {"c=", 
					   "c-", 
					   "dz=", 
					   "d-", 
					   "lj", 
					   "nj", 
					   "s=", 
					   "z="};
		
		for(int i=0; i<ca.length; i++) {
			input = input.replaceAll(ca[i], "C");
		}
		
		int result = input.length();
		System.out.println(result);
		
	}
}
