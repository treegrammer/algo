package bj.bronze1;

import java.util.Scanner;

public class Main_1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int idx = 1;
		int tmp = n/10 + n%10;
		int next = n%10*10 + tmp%10;
		while(n != next) {
			idx++;
			tmp = next/10 + next%10;
			next = next%10*10 + tmp%10;
		}
		System.out.println(idx);
	}
}
