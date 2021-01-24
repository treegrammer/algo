package bj.bronze5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2475 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		int n1 = Integer.parseInt(tokens.nextToken());
		int n2 = Integer.parseInt(tokens.nextToken());
		int n3 = Integer.parseInt(tokens.nextToken());
		int n4 = Integer.parseInt(tokens.nextToken());
		int n5 = Integer.parseInt(tokens.nextToken());
		System.out.println( (n1*n1+n2*n2+n3*n3+n4*n4+n5*n5) % 10);
	}
}
