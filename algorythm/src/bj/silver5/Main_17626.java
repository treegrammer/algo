package bj.silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_17626 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long sTime = System.currentTimeMillis();
		
		int[] dp = new int[50001];
		dp[1] = 1;
		int min = 0;
		for(int i=2; i<50001; i++) {
			min = Integer.MAX_VALUE;
			
			for(int j=1; j*j <= i; j++) {
				int temp = i - j * j;
				min = Math.min(min, dp[temp]);
			}
			dp[i] = min+1;
		}
		
		System.out.println(dp[n]);
		long eTime = System.currentTimeMillis();
//		System.out.println(eTime-sTime);
	}
}
