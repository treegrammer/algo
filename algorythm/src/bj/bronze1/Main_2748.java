package bj.bronze1;

import java.util.Scanner;

public class Main_2748 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long[] fibo = new long[91];
		fibo[0] = 0;
		fibo[1] = 1;
		for(int i=2; i<91; i++) {
			fibo[i] = fibo[i-2] + fibo[i-1];
		}
		
		System.out.println(fibo[n]);
	}
}
