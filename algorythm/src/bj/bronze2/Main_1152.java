package bj.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1152 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		
		int cnt = 0;
		for(int i=0; i<tmp.length(); i++) {
			if(tmp.charAt(i) == ' ') {
				cnt++;
			}
		}
		cnt++;
		if(tmp.charAt(0) == ' ') {
			cnt--;
		}
		if(tmp.charAt(tmp.length()-1) == ' ') {
			cnt--;
		}
		
		System.out.println(cnt);
	}
}
