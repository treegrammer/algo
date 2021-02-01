package bj.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1966 {
	public static void main(String[] args) throws Exception {
		StringBuilder result = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=t; tc++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(tokens.nextToken());
			int m = Integer.parseInt(tokens.nextToken());
			
			int[] arr = new int[n];
			Queue<pr> q = new LinkedList<pr>();
			tokens = new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) {
				int imp = Integer.parseInt(tokens.nextToken());
				boolean tg = false;
				if(i == m) {
					tg = true;
				}
				q.add(new pr(imp,tg));
				arr[i] = imp;
			}
			Arrays.sort(arr);

			int cnt = 0;
			for(int i=n-1; i>=0; i--) {
				while(q.peek().imp != arr[i]) {
					q.offer(q.poll());
				}
				cnt++;
				pr p = q.poll();
				if(p.tg) {
					result.append(cnt).append("\n");
				}
			}
			
		}
		System.out.println(result);
	}
	static class pr{
		int imp;
		boolean tg;
		public pr() {
			super();
		}
		public pr(int imp, boolean tg) {
			super();
			this.imp = imp;
			this.tg = tg;
		}
	}
}
