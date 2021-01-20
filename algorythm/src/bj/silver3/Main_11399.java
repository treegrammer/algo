package bj.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_11399 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] p = new int[n];
		
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			p[i] = Integer.parseInt(tokens.nextToken());
		}
		
		Arrays.sort(p);
		int sum = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				sum += p[j];
			}
		}
		
		System.out.println(sum);
	}
}
