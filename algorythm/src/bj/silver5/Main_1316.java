package bj.silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1316 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int result = 0;
		for(int i=0; i<n; i++) {
			result++;
			boolean[] ck = new boolean['z' - 'a' + 1];
			String cmd = br.readLine();
			int buf = 0;
			for(int j=0; j<cmd.length(); j++) {
				int now = cmd.charAt(j) - 'a';
				if(ck[now]) {
					if(buf != now) {
						result -= 1;
						break;
					}
				}
				ck[now] = true;
				buf = now;
			}
		}
		System.out.println(result);
	}
}
