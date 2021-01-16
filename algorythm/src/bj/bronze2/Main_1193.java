package bj.bronze2;

import java.util.Scanner;

public class Main_1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int n = 1;
		int m = 1;
		boolean left = true;
		for(int i=1; i<x; i++) {
			if(left && n == 1) {
				left = !left;
				m++;
				continue;
			}
			if(!left && m==1) {
				left = !left;
				n++;
				continue;
			}
			if(left) {
				n--;
				m++;
			}
			else {
				n++;
				m--;
			}
		}
		System.out.println(n + "/" + m);
	}
}
