package bj.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1712 {
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		
		long a = Long.parseLong(tokens.nextToken());
		long b = Long.parseLong(tokens.nextToken());
		long c = Long.parseLong(tokens.nextToken());
		
		int idx = -1;
		if(b<c) {
			idx = (int)(a / (c-b) + 1);		
		}
		
		sb.append(idx);
		System.out.println(sb);
	}
}
