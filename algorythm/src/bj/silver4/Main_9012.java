package bj.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_9012 {
	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int tc=0; tc<t; tc++) {
			Stack<Character> stack = new Stack<>();
			char[] crr = br.readLine().toCharArray();
			for(int i=0; i<crr.length; i++) {
				if(crr[i] == '(') {
					stack.push('(');
					continue;
				}
				if(crr[i] == ')') {
					if(stack.isEmpty()) {
						stack.push('(');
						break;
					}
					stack.pop();
					continue;
				}
			}
			if(stack.isEmpty()) {
				sb.append("YES").append("\n");
				continue;
			}
			sb.append("NO").append("\n");
		}
		System.out.println(sb);
	}
}
