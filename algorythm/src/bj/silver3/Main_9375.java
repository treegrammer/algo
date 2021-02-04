package bj.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main_9375 {
	static int sum;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder result = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=t; tc++) {
			int n = Integer.parseInt(br.readLine());
			List<Fash> list = new ArrayList<>();
			for(int i=0; i<n; i++) {
				StringTokenizer tokens = new StringTokenizer(br.readLine());
				String val = tokens.nextToken();
				String key = tokens.nextToken();
				boolean ck = false;
				for(int j=0; j<list.size(); j++) {
					if(list.get(j).key.equals(key)) {
						list.add(new Fash(key, list.get(j).val+1));
						list.remove(j);
						ck = true;
						break;
					}
				}
				if(!ck) {
					list.add(new Fash(key, 1));
				}
			}
			
			// 공식 사용
			int[] kind = new int[list.size()];
			for(int i=0; i<list.size(); i++) {
				kind[i] = list.get(i).val;
			}
			sum = 0;
			find(0,1,kind);
			
			result.append(sum-1).append("\n");
		}
		System.out.println(result);
	}
	public static void find(int now, int cnt, int[] kind) {
		if(now >= kind.length) {
			sum += cnt;
			return;
		}
		find(now+1, cnt * kind[now], kind);
		find(now+1, cnt, kind);
	}
	static class Fash{
		String key;
		int val;
		public Fash(){
			super();
		}
		public Fash(String key, int val) {
			super();
			this.key = key;
			this.val = val;
		}
	}
}
