package bj.silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_2178 {
	public static char[][] crr;
	public static boolean[][] v;
	public static int[] dx = {0,0,-1,1};
	public static int[] dy = {-1,1,0,0};
	public static int result;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(tokens.nextToken());
		int m = Integer.parseInt(tokens.nextToken());
		crr = new char[n][m];
		v = new boolean[n][m];

		result = Integer.MAX_VALUE;
		for(int i=0; i<n; i++) {
			crr[i] = br.readLine().toCharArray();
		}
		
//		dfs(0,0,1);
		Queue<Raider> q = new LinkedList<Raider>();
		q.offer(new Raider(0,0,1));
		v[0][0] = true;
		while(!q.isEmpty()) {
			Raider now = q.poll();
			if(now.sy == crr.length-1 && now.sx == crr[0].length-1) {
				result = now.cnt;
				break;
			}
			
			for(int d=0; d<4; d++) {
				int ny = now.sy + dy[d];
				int nx = now.sx + dx[d];
				if(ny < 0 || nx < 0 || ny >= crr.length || nx >= crr[0].length) {
					continue;
				}
				if(crr[ny][nx] == '0') {
					continue;
				}
				if(v[ny][nx]) {
					continue;
				}
				q.offer(new Raider(ny,nx,now.cnt+1));
				v[ny][nx] = true;
			}
		}
		
		System.out.println(result);
	}
	static class Raider{
		public int sy;
		public int sx;
		public int cnt;
		public Raider() {
			super();
		}
		public Raider(int sy, int sx,  int cnt) {
			this.sy = sy;
			this.sx = sx;
			this.cnt = cnt;
		}
	}
	public static void dfs(int sy, int sx, int cnt) {
		if(sy == crr.length-1 && sx == crr[0].length-1) {
			if(result > cnt) {
				result = cnt;
			}
			return;
		}
		
		// 4¹æÅ½»ö
		for(int d=0; d<4; d++) {
			int ny = sy + dy[d];
			int nx = sx + dx[d];
			if(ny < 0 || nx < 0 || ny >= crr.length || nx >= crr[0].length) {
				continue;
			}
			if(crr[ny][nx] == '0') {
				continue;
			}
			if(v[ny][nx]) {
				continue;
			}
			v[ny][nx] = true;
//			find(ny,nx,cnt+1);
			v[ny][nx] = false;
		}
	}
}
