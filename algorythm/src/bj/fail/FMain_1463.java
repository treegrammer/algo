package bj.fail;

import java.util.Scanner;

public class FMain_1463 {
	// 시도 1 : dfs -> timeout
	static int result;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		result = Integer.MAX_VALUE;
		dfs(n,0);
		System.out.println(result);
	}
	public static void dfs(int n, int cnt) {
		if(n == 1) {
			result = cnt<result?cnt:result;
			return;
		}
		// 3으로 나누기
		if(n%3 == 0) {
			dfs(n/3, cnt+1);
		}
		// 2로 나누기
		if(n%2 == 0) {
			dfs(n/2, cnt+1);
		}
		// 1빼기
		dfs(n-1, cnt+1);
	}
}


