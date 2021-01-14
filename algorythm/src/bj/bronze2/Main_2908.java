package bj.bronze2;

import java.util.Scanner;

public class Main_2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int ca = change(a);
		int cb = change(b);
		
		System.out.println(max(ca,cb));
	}
	static int change(int a) {
		String tmp = Integer.toString(a);
		StringBuilder sb = new StringBuilder();
		for(int i=tmp.length()-1; i>=0; i--) {
			sb.append(tmp.charAt(i));
		}
		return Integer.parseInt(sb.toString());
	}
	static int max(int a, int b) {
		if(a >= b) {
			return a;
		}
		return b;
	}
}
