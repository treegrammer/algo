package bj.bronze2;

import java.util.Scanner;

public class Main_2231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int result = 0;
		for(int i=1; i<=n; i++) {
			int num = i;
			String tmp = Integer.toString(num);
			for(int j=0; j<tmp.length(); j++) {
				num += tmp.charAt(j) - '0';
			}
			if(num == n) {
				result = i;
				break;
			}
		}

		System.out.println(result);
	}
}
