package bj.bronze2;

import java.util.Scanner;

public class Main_10953 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++) {
			String input = sc.next();
			String[] srr = input.split(",");
			int a = Integer.parseInt(srr[0]);
			int b = Integer.parseInt(srr[1]);
			System.out.println(a+b);
		}
	}
}
