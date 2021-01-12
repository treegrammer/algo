package bj.bronze3;

import java.util.Scanner;

public class Main_10872 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 1;
		for(int i=n; i>0; i--) {
			result *= i;
		}
		
		result = fact(n);
		System.out.println(result);
	}
	static int fact(int n) {
		if(n<=1) {
			return 1;
		}
		return n * fact(n-1);
	}
}
