package bj.Gold5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1107 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		boolean[] num = new boolean[10];
		
		if(m>0) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			for(int i=0; i<m; i++) {
				num[Integer.parseInt(tokens.nextToken())] = true;
			}			
		}
		
		// + - 로만 이동
		int count1 = 100-n>0?100-n:n-100;
		
		// 숫자 + - 로 이동
		int cannum2 = n-1;
		boolean ck = true;
		while(ck) {
			cannum2++;
			if(cannum2 > n+count1) {
				break;
			}
			ck = false;
			String tmp = Integer.toString(cannum2);
			for(int i=0; i<tmp.length(); i++) {
				if(num[tmp.charAt(i) - '0']) {
					ck = true;
					break;
				}
			}
		}
		int count2 = cannum2 - n + Integer.toString(cannum2).length();
		
		int cannum1 = n+1;
		ck = true;
		while(ck) {
			cannum1--;
			if(cannum1 < 0) {
				cannum1 = cannum2+1;
				break;
			}
			ck = false;
			String tmp = Integer.toString(cannum1);
			for(int i=0; i<tmp.length(); i++) {
				if(num[tmp.charAt(i) - '0']) {
					ck = true;
					break;
				}
			}
		}
		int count3 = 0;
		if(cannum1 > n) {
			count3 = count2 + 1;
		}
		else {
			count3 = n - cannum1 + Integer.toString(cannum1).length();			
		}
		
		int result = count1<count2?count1:count2;
		result = result<count3?result:count3;
		
		System.out.println(result);
	}
}
