package bj.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1546 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		int max = Integer.MIN_VALUE;
		String tmp = br.readLine();
		StringTokenizer tokens = new StringTokenizer(tmp);
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(tokens.nextToken());
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		double sum = 0;
		for(int i=0; i<n; i++) {
			sum += (double)arr[i]*100/max;
		}
		sb.append((double)sum/n);
		System.out.println(sb);
	}
}
