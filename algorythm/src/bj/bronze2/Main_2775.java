package bj.bronze2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2775 {
	public static void main(String[] args) throws Exception {
		StringBuilder result = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int[][] map = new int[15][15];
		for(int i=1; i<15; i++) {
			map[0][i] = i;
		}
		for(int i=1; i<15; i++) {
			for(int j=1; j<15; j++) {
				int sum = 0;
				for(int k=1; k<=j; k++) {
					sum += map[i-1][k];
				}
				map[i][j] = sum;
			}
		}
		
		for(int tc=1; tc<=t; tc++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			result.append(map[k][n]).append("\n");
		}
		
		System.out.println(result);
	}
}
