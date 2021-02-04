package bj.silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1068 {
	static int result;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		int start = -1;
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(tokens.nextToken());
			if(arr[i] == -1) {
				start = i;
			}
		}
		int x = Integer.parseInt(br.readLine());
		
		result = 0;
		
		dfs(start,arr,x);

		System.out.println(result);
	}
	public static void dfs(int now, int[] arr, int x) {
		if(now >= arr.length) {
			return;
		}
		if(now == x) {
			return;
		}
		// 하위노드가 없을때 result++
		// 내 상위가 x일때 => arr[i] == x
		// 내 하위가 x일때 => i == x
		boolean ck = false;
		for(int i=0; i<arr.length; i++) {
			// 하위가 x일때
			if(i == x) {
				continue;
			}
			// 상위가 x일때
			if(arr[i] == x) {
				continue;
			}
			// now의 하위노드를 찾았을때(i의 상위가 now일 때)
			if(arr[i] == now) {
				ck = true;
				dfs(i, arr, x);
			}
		}
		if(!ck) {
//			System.out.println(now);
			result++;
		}
	}
}
