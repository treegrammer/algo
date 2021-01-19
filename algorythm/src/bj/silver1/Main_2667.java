package bj.silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main_2667 {
	static int[] dy = {-1, 1, 0, 0};
	static int[] dx = {0, 0, -1, 1};
	static int sum;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		boolean[][] v = new boolean[n][n];
		char[][] map = new char[n][n];
		for(int i=0; i<n; i++) {
			map[i] = br.readLine().toCharArray();
		}
		
		List<Integer> list = new LinkedList<Integer>();
		int idx = 1;
		for(int y=0; y<n; y++) {
			for(int x=0; x<n; x++) {
				if(map[y][x] == '0') {
					continue;
				}
				if(v[y][x]) {
					continue;
				}
				v[y][x] = true;
				sum = 1;
				idx++;
				// 4¹æÅ½»ö
				find(map, v, y, x, idx);
				list.add(sum);
			}
		}
		
		Collections.sort(list);
		
		System.out.println(list.size());
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	public static void find(char[][] map, boolean[][] v, int ny, int nx, int idx) {
		for(int d=0; d<4; d++) {
			int sy = ny + dy[d];
			int sx = nx + dx[d];
			if(sy < 0 || sx < 0 || sy >= map.length || sx >= map.length) {
				continue;
			}
			if(v[sy][sx]) {
				continue;
			}
			if(map[sy][sx] == '0') {
				continue;
			}
			sum++;
			v[sy][sx] = true;
			find(map,v,sy,sx,idx);
		}
	}
	
}
