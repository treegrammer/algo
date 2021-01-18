package bj.bronze3;

import java.util.Scanner;

public class Main_2747 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] fibo = new int[46];
		fibo[0] = 0;
		fibo[1] = 1;
		for(int i=2; i<46; i++) {
			fibo[i] = fibo[i-2] + fibo[i-1];
		}
		
		System.out.println(fibo[n]);
	}
}
