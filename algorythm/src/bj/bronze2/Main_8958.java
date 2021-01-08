package bj.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_8958 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=t; tc++) {
			String tmp = br.readLine();
			int add = 0;
			int sum = 0;
			for(int i=0; i<tmp.length(); i++) {
				if(tmp.charAt(i) == 'O') {
					add++;
					sum += add;
					continue;
				}
				if(tmp.charAt(i) == 'X') {
					add = 0;
				}
			}
			sb.append(sum).append("\n");
		}
		System.out.println(sb);
	}
}
