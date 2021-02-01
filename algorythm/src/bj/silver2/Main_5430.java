package bj.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_5430 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder result = new StringBuilder();
		for(int tc=0; tc<t; tc++) {
			String cmd = br.readLine();
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			
			String input = br.readLine();
			input = input.substring(1,input.length()-1);
			String[] srr = input.split(",");
			for(int i=0; i<n; i++) {
				arr[i] = Integer.parseInt(srr[i]);
			}
			
			boolean ck = false;
			boolean rv = false;
			int left = 0;
			int right = n-1;
			for(int i=0; i<cmd.length(); i++) {
				if(cmd.charAt(i) == 'R') {
					rv = !rv;
				}
				if(cmd.charAt(i) == 'D') {
					if(left > right) {
						ck = true;
						result.append("error").append("\n");
						break;
					}
					if(!rv) {
						left++;
					}
					else if(rv) {
						right--;
					}
				}
			}
			
			if(!ck) {
				result.append("[");
				if(rv) {
					for(int i=right; i>=left; i--) {
						result.append(arr[i]);
						if(i != left) {
							result.append(",");
						}
					}
				}
				else {
					for(int i=left; i<=right; i++) {
						result.append(arr[i]);
						if(i != right) {
							result.append(",");
						}
					}
				}
				result.append("]").append("\n");
			}
			
		}
		
		System.out.println(result);
	}
}
