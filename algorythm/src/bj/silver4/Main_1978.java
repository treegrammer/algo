package bj.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1978 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		
		int cnt = 0;
		boolean ck = true;
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(tokens.nextToken());
			if(num == 1) {
				ck = false;
			}
			for(int j=2; j<num; j++) {
				if(num%j == 0) {
					ck = false;
					break;
				}
			}
			if(ck == true) {
				cnt++;
			}
			ck = true;
		}
		
		System.out.println(cnt);
	}
}
