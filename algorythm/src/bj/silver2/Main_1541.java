package bj.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1541 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		// -뒤는 -가 나올때까지 계속 빼주면 됨
		StringBuilder tmp = new StringBuilder();
		boolean allminus = false;
		int result = 0;
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == '+') {
				if(allminus) {
					result -= Integer.parseInt(tmp.toString());					
				}
				else {
					result += Integer.parseInt(tmp.toString());						
				}
				tmp = new StringBuilder();
			}
			else if(input.charAt(i) == '-') {
				if(allminus) {
					result -= Integer.parseInt(tmp.toString());					
				}
				else {
					result += Integer.parseInt(tmp.toString());						
				}
				tmp = new StringBuilder();
				allminus = true;
			}
			else {
				tmp.append(input.charAt(i));
			}
		}
		if(allminus) {
			result -= Integer.parseInt(tmp.toString());					
		}
		else {
			result += Integer.parseInt(tmp.toString());						
		}
		System.out.println(result);
	}
}
