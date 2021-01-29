package bj.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1654 {
	static long result;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(tokens.nextToken());
		int n = Integer.parseInt(tokens.nextToken());
		long[] lines = new long[k];
				
		long max = Long.MIN_VALUE;
		for(int i=0; i<k; i++) {
			lines[i] = Long.parseLong(br.readLine());
			if(max < lines[i]) {
				max = lines[i];
			}
		}
		
		result = 0;
		binarysearch(1,max,lines, n);
		
		System.out.println(result);
	}
	public static void binarysearch(long left, long right, long[] arr, int n) {
		if(left > right) {
			return;
		}
//		System.out.println(left + " " + right + " " + (left+right)/2);
		int sum = 0;
		long mid = (right+left)/2;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i]/mid;
		}
		if(sum >= n) {
			if(result < mid) {
				result = mid;				
			}
			binarysearch(mid+1, right, arr, n);
		}
		if(sum < n) {
			binarysearch(left,mid-1,arr,n);
		}
	}
}
