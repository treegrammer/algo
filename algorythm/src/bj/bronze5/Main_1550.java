package bj.bronze5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1550 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		int result = 0;
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)-0 <= 57) {
				int now = a.charAt(i) - '0';
				result += now * Math.pow(16, a.length()-i-1);
				continue;
			}
			int now = a.charAt(i) - 'A' + 10;
			result += now * Math.pow(16, a.length()-i-1);
		}
		
		System.out.println(result);
	}
}
