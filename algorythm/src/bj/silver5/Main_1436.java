package bj.silver5;

import java.util.Scanner;

public class Main_1436 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int cnt = 0;
		int now = 666;
		int result = 0;
		while(cnt != n) {
			String tmp = Integer.toString(now);
			for(int i=0; i<=tmp.length()-3; i++) {
				if(tmp.charAt(i) == '6' && tmp.charAt(i+1) == '6' && tmp.charAt(i+2) == '6') {
					cnt++;
					result = now;
					break;
				}
			}
			now++;
		}
		
		System.out.println(result);
	}
}
