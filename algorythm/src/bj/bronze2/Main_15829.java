package bj.bronze2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_15829 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		String val = br.readLine();
		long mod = 1234567891;
		long result = 0;
		for(int i=0; i<val.length(); i++) {
			long r = 1;
			for(int j=1; j<=i; j++) {
				r = (r * 31) % mod;
			}
			long now = val.charAt(i)- 'a' + 1;
			result = (result + (now * r) % mod) % mod;
		}
		System.out.println(result);
	}
}
