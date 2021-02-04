package bj.silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_9205 {
	static boolean possible;
	static boolean[] v;
	static List<Point> list;
	static Point start;
	static Point end;
	public static void main(String[] args) throws Exception {
		StringBuilder result = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=t; tc++) {
			int n = Integer.parseInt(br.readLine());
			list = new ArrayList<Point>();
			v = new boolean[n+2];
			for(int i=0; i<n+2; i++) {
				StringTokenizer tokens = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(tokens.nextToken());
				int y = Integer.parseInt(tokens.nextToken());
				list.add(new Point(x,y));
			}
			start = list.get(0);
			end = list.get(list.size()-1);
			
			Collections.sort(list, new Comparator<Point>() {
				public int compare(Point o1, Point o2) {
					int o1len = Math.abs(start.x - o1.x) + Math.abs(start.y - o1.y);
					int o2len = Math.abs(start.x - o2.x) + Math.abs(start.y - o2.y);
					if(o1len < o2len) {
						return -1;
					}
					else if(o1len == o2len) {
						return 1;
					}
					return 0;
				}
			});
			
			possible = false;
			nav();
			
			if(possible) {
				result.append("happy").append("\n");
				continue;
			}
			result.append("sad").append("\n");
		}
		System.out.println(result);
	}
	public static void nav() {
		Queue<Point> q = new LinkedList<>();
		v[0] = true;
		q.offer(start);
		while(!q.isEmpty()) {
			Point now = q.poll();
			if(now.x == end.x && now.y == end.y) {
				possible = true;
				break;
			}
			for(int i=0; i<list.size(); i++) {
				if(v[i]) {
					continue;
				}
				int dx = Math.abs(list.get(i).x - now.x);
				int dy = Math.abs(list.get(i).y - now.y);
				if(dx + dy <= 1000) {
					q.offer(list.get(i));
					v[i] = true;
				}
			}
		}
	}
	static class Point{
		int x;
		int y;
		public Point() {
			super();
		}
		public Point(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
	}
}
