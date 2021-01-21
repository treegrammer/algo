package bj.silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1011 {
	public static void main(String[] args) throws Exception {		
		StringBuilder result = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int tc=0; tc<t; tc++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			long x = Long.parseLong(tokens.nextToken());
			long y = Long.parseLong(tokens.nextToken());
			
			long fiboa = 0;
			int a = 0;
			for(int i=1; i<=y-x; i++) {
				fiboa += i;
				if(y-x < fiboa * 2) {
					a = i;
					break;
				}
			}
			
			int cnt = 0;
			if(y-x - fiboa - fiboa <= a) {
				cnt = a + a + 1;
			}
			if(y-x - fiboa - fiboa <= 0) {
				cnt = a + a - 1 + 1;
			}
			if(y-x - fiboa - fiboa <= -a) {
				cnt = a + a - 1 - 1 + 1;
			}
			if(y-x - fiboa - fiboa == -2 * a) {
				cnt = a + a - 1 - 1;
			}
				
			result.append(cnt).append("\n");
		}
		System.out.println(result);
	}
}
