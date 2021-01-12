package bj.bronze2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2675 {
	public static void main(String[] args) throws Exception{
		StringBuilder result = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int tc=0; tc<t; tc++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(tokens.nextToken());
			String s = tokens.nextToken();
			for(int i=0; i<s.length(); i++) {
				for(int j=0; j<r; j++) {					
					result.append(s.charAt(i));
				}
			}
			result.append("\n");
		}
		System.out.println(result);
	}
}
