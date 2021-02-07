package bj.silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1149 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n+1][3];
		int[][] dp = new int[n+1][3];
		
		for(int i=1; i<n+1; i++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			for(int j=0; j<3; j++) {
				arr[i][j] = Integer.parseInt(tokens.nextToken());
			}
		}

		for(int i=1; i<n+1; i++) {
			dp[i][0] = Integer.min(dp[i-1][1], dp[i-1][2]) + arr[i][0];
			dp[i][1] = Integer.min(dp[i-1][0], dp[i-1][2]) + arr[i][1];
			dp[i][2] = Integer.min(dp[i-1][0], dp[i-1][1]) + arr[i][2];			
		}
		
		int result = Integer.MAX_VALUE;
		for(int i=0; i<3; i++) {
			result = result<dp[n][i]?result:dp[n][i];
		}
		
		System.out.println(result);
	}
}
