package bj.bronze1;

import java.util.Scanner;

public class Main_2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = -1;
		for(int i=n/5; i>=0; i--) {
			if((n - 5*i) % 3 == 0) {
				result = i + ((n-5*i)/3);
				break;
			}
		}
		System.out.println(result);
	}
}
