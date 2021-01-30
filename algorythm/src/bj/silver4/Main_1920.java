package bj.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1920 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[] arr = new long[n];
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Long.parseLong(tokens.nextToken());
		}
		Arrays.sort(arr);
		
		int m = Integer.parseInt(br.readLine());
		tokens = new StringTokenizer(br.readLine());
		long[] arr2 = new long[m];
		for(int i=0; i<m; i++) {
			arr2[i] = Long.parseLong(tokens.nextToken());
		}
		
		StringBuilder result = new StringBuilder();
		for(int i=0; i<m; i++) {
			int left = 0;
			int right = n-1;
			long now = Long.MIN_VALUE;
			long find = arr2[i];
			while(now != find) {
				if(left > right) {
					result.append("0").append("\n");
					break;
				}
				int mid = (left + right)/2;
				now = arr[mid];
				if(now == find) {
					result.append("1").append("\n");
				}
				else if(now < find) {
					left = mid+1;
				}
				else if(now > find) {
					right = mid-1;
				}
			}
		}
		
		System.out.println(result);
	}
}
