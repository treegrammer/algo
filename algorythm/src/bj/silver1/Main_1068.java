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
		// ������尡 ������ result++
		// �� ������ x�϶� => arr[i] == x
		// �� ������ x�϶� => i == x
		boolean ck = false;
		for(int i=0; i<arr.length; i++) {
			// ������ x�϶�
			if(i == x) {
				continue;
			}
			// ������ x�϶�
			if(arr[i] == x) {
				continue;
			}
			// now�� ������带 ã������(i�� ������ now�� ��)
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
