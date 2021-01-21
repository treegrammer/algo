package bj.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_11866 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder result = new StringBuilder();
		
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(tokens.nextToken());
		int k = Integer.parseInt(tokens.nextToken());
		
		List<Integer> list = new LinkedList<Integer>();
		for(int i=1; i<=n; i++) {
			list.add(i);
		}
		
		result.append("<");
		int now = -1;
		int cnt = 0;
		while(list.size() > 1) {
			cnt++;
			now++;
			if(now >= list.size()) {
				now %= list.size();
			}
			if(cnt == k) {
				result.append(list.get(now)).append(", ");
				list.remove(now);
				now--;
				cnt = 0;
			}
		}
		result.append(list.get(0)).append(">");
		System.out.println(result);
	}
}
