package bj.bronze3;

import java.util.Scanner;

public class Main_11021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=1; i<=t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Case #" + i + ": " + (a+b));
		}
	}
}
