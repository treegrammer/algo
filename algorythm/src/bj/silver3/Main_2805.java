package bj.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2805 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(tokens.nextToken());
		int m = Integer.parseInt(tokens.nextToken());
		tokens = new StringTokenizer(br.readLine());
		int[] trees = new int[n];
		int max = -1;
		for(int i=0; i<n; i++) {
			trees[i] = Integer.parseInt(tokens.nextToken());
			if(max < trees[i]) {
				max = trees[i];
			}
		}
		
		long left = 0;
		long right = max-1;
		long result = 0;
		while(left<=right) {
			long mid = (right + left)/2;
			long sum = 0;
			for(int i=0; i<n; i++) {
				if(trees[i] > mid) {
					sum += trees[i] - mid;					
				}
			}
			if(sum < m) {
				right = mid-1;
			}
			else if(sum >= m) {
				if(result < mid) {
					result = mid;					
				}
				left = mid+1;
			}
		}
		
		
		System.out.println(result);
	}
}
