package bj.silver2;

import java.util.Scanner;

public class Main_1929 {
	public static void main(String[] args) {
		StringBuilder result = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean[] ck = new boolean[1000001];
		ck[1] = true;
		for(int i=2; i<=m; i++) {
			if(ck[i]) {
				continue;
			}
			int j = 2;
			while(i*j <= m) {
				ck[i*j] = true;
				j++;
			}
		}

		for(int i=n; i<=m; i++) {
			if(!ck[i]) {
				result.append(i).append("\n");
			}
		}
		System.out.println(result);
	}
}
