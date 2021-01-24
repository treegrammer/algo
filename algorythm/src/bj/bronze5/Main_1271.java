package bj.bronze5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main_1271 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		
		BigInteger n = new BigInteger(tokens.nextToken());
		BigInteger m = new BigInteger(tokens.nextToken());
		
		StringBuilder result = new StringBuilder();
		result.append(n.divide(m)).append("\n").append(n.mod(m));
		System.out.println(result);
	}
}
