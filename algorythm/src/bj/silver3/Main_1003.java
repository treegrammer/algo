package bj.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1003 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[][] dp = new int[41][2];
		dp[0][0] = 1;
		dp[0][1] = 0;
		dp[1][0] = 0;
		dp[1][1] = 1;
		for(int i=2; i<41; i++) {
			for(int j=0; j<2; j++) {
				dp[i][j] = dp[i-2][j] + dp[i-1][j];
			}
		}
		StringBuilder result = new StringBuilder();
		for(int tc=1; tc<=T; tc++) {
			int now = Integer.parseInt(br.readLine());
			result.append(dp[now][0]).append(" ").append(dp[now][1]).append("\n");
		}
		System.out.println(result);
	}
}
