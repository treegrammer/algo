package bj.silver3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_18111 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tokens.nextToken());
		int M = Integer.parseInt(tokens.nextToken());
		int B = Integer.parseInt(tokens.nextToken());
		int[][] map = new int[N][M];
		int[] count = new int[257];
		for(int i=0; i<N; i++) {
			tokens = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				map[i][j] = Integer.parseInt(tokens.nextToken());
				count[map[i][j]]++;
			}
		}
		
		// 블록제거 : 2초
		// 블록놓기 : 1초

		int result = Integer.MAX_VALUE;
		int blocks = 0;
		int max = 257;
		// 가능한 층 찾기
		do {
			max--;
			blocks = 0;
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					blocks += map[i][j] - max;
				}
			}
		} while(blocks + B < 0);
		
		// 블록 놓고 제거해보기
		for(int k=max; k>=0; k--) {
			int sum = 0;
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					if(map[i][j] > k) {
						sum += 2*(map[i][j]-k);
					}
					else if(map[i][j] < k) {
						sum += (k-map[i][j]);
					}
				}
			}
			if(sum < result) {
				result = sum;
				max = k;
			}
		}

		bw.write(result + " " + max + "\n");
		bw.flush();
		
	}
}
