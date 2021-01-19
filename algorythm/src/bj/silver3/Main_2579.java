package bj.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2579 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] nums = new int[301];
		int[] dp = new int[301];
		
		for(int i=0; i<n; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}
		dp[0] = nums[0];
		dp[1] = Math.max(nums[0] + nums[1], nums[1]);
		dp[2] = Math.max(nums[0] + nums[2], nums[1] + nums[2]);
		for(int i=3; i<=n; i++) {
			dp[i] = Math.max(dp[i-3] + nums[i-1] + nums[i], dp[i-2] + nums[i]);
		}
		
		System.out.println(dp[n-1]);
	}
}
