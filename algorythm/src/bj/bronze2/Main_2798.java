package bj.bronze2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2798 {
	static int result;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(tokens.nextToken());
		int m = Integer.parseInt(tokens.nextToken());
		int[] arr = new int[n];
		tokens = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(tokens.nextToken());
		}
		
		result = 0;
		find(arr,n,m,0,0,0);
		System.out.println(result);
	}
	public static void find(int[] arr, int n, int m, int now, int sum, int cnt) {
		if(cnt == 3) {
			if(m - sum >= 0) {
				result = m-result<m-sum?result:sum;
			}
			return;
		}
		if(now >= n) {
			return;
		}
		// ÀÌ°Å °ñ¶ó¿ä!
		find(arr, n, m, now+1, sum+arr[now], cnt+1);
		// ¾È°ñ¶ó¿ä!
		find(arr, n, m, now+1, sum, cnt);
	}
}
