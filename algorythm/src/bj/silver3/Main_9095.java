package bj.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_9095 {
	static int count;
	public static void main(String[] args) throws Exception {
		StringBuilder result = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=t; tc++) {
			int n = Integer.parseInt(br.readLine());
			count = 0;
			find(n,0);
			result.append(count).append("\n");
		}
		System.out.println(result);
	}
	public static void find(int n, int sum) {
		if(sum > n) {
			return;
		}
		if(sum == n) {
			count++;
			return;
		}
		find(n, sum+1);
		find(n, sum+2);
		find(n, sum+3);
	}
}
