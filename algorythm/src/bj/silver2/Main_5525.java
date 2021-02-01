package bj.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_5525 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		char[] crr = br.readLine().toCharArray();

		int len = 0;
		int result = 0;
		for(int i=0; i<m-2; i++) {
			if(crr[i] == 'I' && crr[i+1] == 'O' && crr[i+2] == 'I') {
				len++;
				if(len == n) {
					len--;
					result++;
				}
				i++;
			}
			else {
				len = 0;
			}
		}
		
		System.out.println(result);
	}
}
