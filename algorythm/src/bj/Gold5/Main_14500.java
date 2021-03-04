package bj.Gold5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_14500 {
	static int N;
	static int M;
	static int[][] Map;
	static int result;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		N = Integer.parseInt(tokens.nextToken());
		M = Integer.parseInt(tokens.nextToken());
		Map = new int[N][M];
		result = Integer.MIN_VALUE;
		for(int i=0; i<N; i++) {
			tokens = new StringTokenizer(br.readLine());
			for(int j=0; j<M;  j++) {
				Map[i][j] = Integer.parseInt(tokens.nextToken());
			}
		}
		
		for(int y=0; y<N; y++) {
			for(int x=0; x<M; x++) {
				texture1(y,x);
				texture2(y,x);
				texture3(y,x);
				texture4(y,x);
				texture5(y,x);
			}
		}
		
		System.out.println(result);
	}
	static void texture1(int y, int x) {
		// ----
		if(y < N && x+3 < M) {
			int cnt = 0;
			cnt = Map[y][x] + Map[y][x+1] + Map[y][x+2] + Map[y][x+3];
			result = result>cnt?result:cnt;
		}
		
		// - 
		// -
		// -
		// -
		if(y+3 < N && x < M) {
			int cnt = 0;
			cnt = Map[y][x] + Map[y+1][x] + Map[y+2][x] + Map[y+3][x];
			result = result>cnt?result:cnt;			
		}
	}
	static void texture2(int y, int x) {
		// --
		// --
		if(y+1 < N && x+1 < M) {
			int cnt = 0;
			cnt = Map[y][x] + Map[y][x+1] + Map[y+1][x] + Map[y+1][x+1];
			result = result>cnt?result:cnt;
		}
	}
	static void texture3(int y, int x) {
		// -
		// --
		//  -
		if(y+2 < N && x+1 < M) {
			int cnt = 0;
			cnt = Map[y][x] + Map[y+1][x] + Map[y+1][x+1] + Map[y+2][x+1];
			result = result>cnt?result:cnt;
		}
		
		//  --
		// --
		if(y+1 < N && x+2 < M) {
			int cnt = 0;
			cnt = Map[y][x+1] + Map[y][x+2] + Map[y+1][x] + Map[y+1][x+1];
			result = result>cnt?result:cnt;
		}
		
		//  -
		// --
		// -
		if(y+2 < N && x+1 < M) {
			int cnt = 0;
			cnt = Map[y][x+1] + Map[y+1][x] + Map[y+1][x+1] + Map[y+2][x];
			result = result>cnt?result:cnt;
		}
		
		// --
		//  --
		if(y+1 < N && x+2 < M) {
			int cnt = 0;
			cnt = Map[y][x] + Map[y][x+1] + Map[y+1][x+1] + Map[y+1][x+2];
			result = result>cnt?result:cnt;
		}
	}
	static void texture4(int y, int x) {
		// -
		// -
		// --
		if(y+2 < N && x+1 < M) {
			int cnt = 0;
			cnt = Map[y][x] + Map[y+1][x] + Map[y+2][x] + Map[y+2][x+1];
			result = result>cnt?result:cnt;
		}
		
		//   -
		// ---
		if(y+1 < N && x+2 < M) {
			int cnt = 0;
			cnt = Map[y][x+2] + Map[y+1][x] + Map[y+1][x+1] + Map[y+1][x+2];
			result = result>cnt?result:cnt;
		}
		
		// --
		//  -
		//  -
		if(y+2 < N && x+1 < M) {
			int cnt = 0;
			cnt = Map[y][x] + Map[y][x+1] + Map[y+1][x+1] + Map[y+2][x+1];
			result = result>cnt?result:cnt;
		}
		
		// ---
		// -
		if(y+1 < N && x+2 < M) {
			int cnt = 0;
			cnt = Map[y+1][x] + Map[y][x] + Map[y][x+1] + Map[y][x+2];
			result = result>cnt?result:cnt;
		}
		
		//  -
		//  -
		// --
		if(y+2 < N && x+1 < M) {
			int cnt = 0;
			cnt = Map[y][x+1] + Map[y+1][x+1] + Map[y+2][x] + Map[y+2][x+1];
			result = result>cnt?result:cnt;
		}
		
		// -
		// ---
		if(y+1 < N && x+2 < M) {
			int cnt = 0;
			cnt = Map[y][x] + Map[y+1][x] + Map[y+1][x+1] + Map[y+1][x+2];
			result = result>cnt?result:cnt;
		}
		
		// --
		// -
		// -
		if(y+2 < N && x+1 < M) {
			int cnt = 0;
			cnt = Map[y][x] + Map[y][x+1] + Map[y+1][x] + Map[y+2][x];
			result = result>cnt?result:cnt;
		}
		
		// ---
		//   -
		if(y+1 < N && x+2 < M) {
			int cnt = 0;
			cnt = Map[y][x] + Map[y][x+1] + Map[y][x+2] + Map[y+1][x+2];
			result = result>cnt?result:cnt;
		}
	}
	static void texture5(int y, int x) {
		// ---
		//  -
		if(y+1 < N && x+2 < M) {
			int cnt = 0;
			cnt = Map[y][x] + Map[y][x+1] + Map[y][x+2] + Map[y+1][x+1];
			result = result>cnt?result:cnt;
		}
		
		// -
		// --
		// -
		if(y+2 < N && x+1 < M) {
			int cnt = 0;
			cnt = Map[y][x] + Map[y+1][x] + Map[y+1][x+1] + Map[y+2][x];
			result = result>cnt?result:cnt;
		}
		
		//  -
		// ---
		if(y+1 < N && x+2 < M) {
			int cnt = 0;
			cnt = Map[y+1][x] + Map[y+1][x+1] + Map[y+1][x+2] + Map[y][x+1];
			result = result>cnt?result:cnt;
		}
		
		//  -
		// --
		//  -
		if(y+2 < N && x+1 < M) {
			int cnt = 0;
			cnt = Map[y][x+1] + Map[y+1][x] + Map[y+1][x+1] + Map[y+2][x+1];
			result = result>cnt?result:cnt;
		}
	}
}
