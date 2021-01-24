package bj.bronze1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1259 {
	public static void main(String[] args) throws Exception {
		StringBuilder result = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String now = br.readLine();
		while(now.charAt(0) != '0') {
			boolean ck = true;
			for(int i=0; i<now.length()/2; i++) {
				if(now.charAt(i) != now.charAt(now.length()-i-1)) {
					ck = false;
					break;
				}
			}
			if(ck) {
				result.append("yes");
			}
			else {
				result.append("no");
			}
			result.append("\n");
			now = br.readLine();
		}
		
		System.out.println(result);
	}
}
