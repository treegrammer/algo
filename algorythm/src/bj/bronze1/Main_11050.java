package bj.bronze1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11050 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(tokens.nextToken());
		int k = Integer.parseInt(tokens.nextToken());
		
		int a = 1;
		int b = 1;
		for(int i=n; i>Math.max(k,n-k); i--) {
			a *= i;
		}
		for(int j=1; j<=Math.min(k, n-k); j++) {
			b *= j;
		}
		System.out.println(a/b);
	}
}
