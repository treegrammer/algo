package bj.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Main_15552 {
	
//	static String src = "5\r\n" + 
//						"1 1\r\n" + 
//						"12 34\r\n" + 
//						"5 500\r\n" + 
//						"40 60\r\n" + 
//						"1000000 1000000";
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		StringBuilder output = new StringBuilder();
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//		input = new BufferedReader(new StringReader(src));
		
		int t = Integer.parseInt(input.readLine());
		
		for(int tc=0; tc<t; tc++) {
			StringTokenizer tokens = new StringTokenizer(input.readLine());
			long a = Integer.parseInt(tokens.nextToken());
			long b = Integer.parseInt(tokens.nextToken());
			output.append(a+b);
			if(tc != t-1) {
				output.append("\n");
			}
		}
		System.out.println(output);
	}
}
