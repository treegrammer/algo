package bj.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_11720 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String tmp = br.readLine();
		int sum = 0;
		for(int i=0; i<tmp.length(); i++) {
			sum += tmp.charAt(i) - '0';
		}
		System.out.println(sum);
	}
}
