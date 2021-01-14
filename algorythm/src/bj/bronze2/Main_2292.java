package bj.bronze2;

import java.util.Scanner;

public class Main_2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		// 1) 1 
		// 6) 2~7
		// 12) 8~19
		// 18) 20~37
		// 24) 38~61
		int num = 1;
		int cnt = 0;
		while(num < n) {
			cnt++;
			num += cnt*6;
		}
		System.out.println(cnt+1);
	}
}
