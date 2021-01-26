package bj.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1260 {
	static int n;
	static int m;
	static int v;
	static boolean[][] gr;
	static boolean[] c;
	static StringBuilder result;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		n = Integer.parseInt(tokens.nextToken());
		m = Integer.parseInt(tokens.nextToken());
		v = Integer.parseInt(tokens.nextToken());
		gr = new boolean[n+1][n+1];
		c = new boolean[n+1];
		for(int i=0; i<m; i++) {
			tokens = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(tokens.nextToken());
			int b = Integer.parseInt(tokens.nextToken());
			gr[a][b] = true;
			gr[b][a] = true;
		}
		
		result = new StringBuilder();
		dfs(v);
		result.append("\n");
		c = new boolean[n+1];
		bfs(v);
		System.out.println(result);
	}
	public static void dfs(int now) {
		c[now] = true;
		result.append(now).append(" ");
		for(int i=1; i<=n; i++) {
			if(!gr[now][i]) {
				continue;
			}
			if(c[i]) {
				continue;
			}
			dfs(i);
		}	
	}
	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(start);
		while(!q.isEmpty()) {
			int now = q.poll();
			c[now] = true;
			result.append(now).append(" ");
			for(int i=1; i<=n; i++) {
				if(!gr[now][i]) {
					continue;
				}
				if(c[i]) {
					continue;
				}
				q.offer(i);
				c[i] = true;
			}
		}
	}
}
