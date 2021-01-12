package bj.silver4;

import java.util.Scanner;

public class Main_1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int result = 0;
		for(int i=1; i<=n; i++) {
			if(ckHan(i)) {
				result++;
			}
		}
		
		System.out.println(result);
	}
	public static boolean ckHan(int h) {
		if(h >= 100) {
			String tmp = Integer.toString(h);
			int sub = tmp.charAt(0) - tmp.charAt(1);
			for(int i=1; i<tmp.length()-1; i++) {
				if(tmp.charAt(i) - tmp.charAt(i+1) != sub) {
					return false;
				}
			}
		}
		return true;
	}
}