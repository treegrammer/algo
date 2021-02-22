package bj.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_9461 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder result = new StringBuilder();
		long[] dp = new long[101];
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 1;
		dp[4] = 2;
		for(int i=5; i<101; i++) {
			dp[i] = dp[i-1] + dp[i-5];
		}
		
		int T = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T; tc++) {
			int N = Integer.parseInt(br.readLine());
			result.append(dp[N]).append("\n");
		}
		System.out.println(result);
	}
}

/*
 * 1 : 1
 * 2 : 1
 * 3 : 1
 * 4 : 2(3,-1)
 * 5 : 2(4,0)
 * 6 : 3(5,1)
 * 7 : 4(6,2)
 * 8 : 5(7,3)
 * 9 : 7(8,4)
 * 10 : 9(9,5)
 * 11 : 12(10,6)
 * 12 : 16(11,7)
 * 13 : 21(12,8)
 * 14 : 28(13,9)
 * 15 : 
 */