package bj.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2577 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		long cal = (long)a*b*c;
		String tmp = Long.toString(cal);
		int[] cnt = new int[10];
		for(int i=0; i<tmp.length(); i++) {
			cnt[tmp.charAt(i) - '0']++;
		}
		for(int i=0; i<10; i++) {
			sb.append(cnt[i]).append("\n");
		}
		System.out.println(sb);
	}
}
