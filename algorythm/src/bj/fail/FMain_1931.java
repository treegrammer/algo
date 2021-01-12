package bj.fail;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class FMain_1931 {
	// 시간순 정렬 -> dfs -> 시간초과...
	static int result;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Tree> list = new ArrayList<Tree>();
		for(int i=0; i<n; i++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			Tree now = new Tree();
			now.s = Integer.parseInt(tokens.nextToken());
			now.e = Integer.parseInt(tokens.nextToken());
			list.add(now);
		}
		
		Collections.sort(list, new Comparator<Tree>() {
			@Override
			public int compare(Tree o1, Tree o2) {
				if(o1.s < o2.s) {
					return -1;
				}
				else if(o1.s == o2.s) {
					if(o1.e < o2.e) {
						return -1;
					}
				}
				return 1;
			}
		});

		result = 0;
		dfs(list,-1,0,0);
		System.out.println(result);
	}
	public static void dfs(List<Tree> list, int c, int now, int cnt) {
		if(now == list.size()) {
			if(result < cnt) {
				result = cnt;
			}
			return;
		}
		// 가능
		if(c < list.get(now).s) {
			// 추가
			dfs(list, list.get(now).e, now+1, cnt+1);
		}
		// 추가X
		dfs(list, c, now+1, cnt);
	}
	static class Tree{
		public int s;
		public int e;
	}
}
