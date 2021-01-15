package bj.silver4;

import java.util.Scanner;

public class Main_11653 {
	public static void main(String[] args) {
		StringBuilder result = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n!=1) {
			for(int i=2; i<=n; i++) {
				if(n%i == 0) {
					result.append(i).append("\n");
					n /= i;
					break;
				}
			}
		}
		
		System.out.println(result);
	}
}
