package bj.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11053 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int[] arr = new int[A+1];
		int[] dp = new int[A+1];
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		for(int i=1; i<=A; i++) {
			arr[i] = Integer.parseInt(tokens.nextToken());
		}
		int max = 0;
		for(int i=1; i<=A; i++) {
			int min = 0;
			for(int j=0; j<i; j++) {
				if(arr[i] > arr[j]) {
					if(min < dp[j]) {
						min = dp[j];
					}
				}
			}
			dp[i] = min + 1;
			max = max<dp[i]?dp[i]:max;
		}
		
		System.out.println(max);
	}
}
