package bj.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main_1676 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		BigInteger[] fact = new BigInteger[501];
		fact[0] = new BigInteger("1");
		fact[1] = new BigInteger("1");
		for(int i=2; i<=500; i++) {
			fact[i] = fact[i-1].multiply(new BigInteger(Integer.toString(i)));
		}
		
		String tmp = fact[n].toString();
		int cnt = 0;
		for(int i=tmp.length()-1; i>=0; i--) {
			if(tmp.charAt(i) == '0') {
				cnt++;
				continue;
			}
			break;
		}
		
		System.out.println(cnt);
	}
}
