package bj.silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1389 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(tokens.nextToken());
		int m = Integer.parseInt(tokens.nextToken());
		
		int[][] arr = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==j) {
					arr[i][j] = 0;
					continue;
				}
				arr[i][j] = n;
			}
		}
		for(int i=0; i<m; i++) {
			tokens = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(tokens.nextToken())-1;
			int b = Integer.parseInt(tokens.nextToken())-1;
			arr[a][b] = 1;
			arr[b][a] = 1;
		}

		// 플로이드 - 와샬
		for(int k=0; k<n; k++) {	// 경유 포인트
			for(int i=0; i<n; i++) {	// 출발 포인트
				for(int j=0; j<n; j++) {	// 도착 포인트
					if(arr[i][k] + arr[k][j] < arr[i][j]) {
						arr[i][j] = arr[i][k] + arr[k][j];
					}
				}
			}
		}
		
		// 케빈 베이컨 수 카운팅
		int[] result = new int[n];
		for(int j=0; j<n; j++) {
			for(int i=0; i<n; i++) {
				result[j] += arr[i][j];
			}
		}
		
		// 최소값 찾기
		int minnum = Integer.MAX_VALUE;
		int minidx = -1;
		for(int i=0; i<n; i++) {
			if(minnum > result[i]) {
				minnum = result[i];
				minidx = i;
			}
		}
		
		System.out.println(minidx+1);
	}
}
