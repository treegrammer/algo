package bj.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_3052 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] crr = new char[42];
		
		for(int i=0; i<10; i++) {
			crr[Integer.parseInt(br.readLine())%42] = 'O';
		}
		int cnt = 0;
		for(int i=0; i<42; i++) {
			if(crr[i] == 'O') {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
