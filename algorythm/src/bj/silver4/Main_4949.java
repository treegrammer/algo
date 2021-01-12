package bj.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_4949 {
	public static void main(String[] args) throws Exception {
		StringBuilder result = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp;
		while(!(tmp = br.readLine()).equals(".")) {
			// πÆ¿Â ∞ÀªÁ
			Stack<Character> stack = new Stack<>();
			char now;
			for(int i=0; i<tmp.length(); i++) {
				now = tmp.charAt(i);
				if(now == '(' || now == '[') {
					stack.push(now);
					continue;
				}
				else if(now == ')') {
					if(stack.isEmpty()) {
						// ∞≈¡˛
						stack.push(')');
						break;
					}
					if(stack.peek() != '(') {
						// ∞≈¡˛
						break;
					}
					stack.pop();
				}
				else if(now == ']') {
					if(stack.isEmpty()) {
						// ∞≈¡˛
						stack.push(']');
						break;
					}
					if(stack.peek() != '[') {
						// ∞≈¡˛
						break;
					}
					stack.pop();
				}
			}
			
			// πÆ¿Â ∞ÀªÁ øœ∑·!
			if(stack.isEmpty()) {
				result.append("yes").append("\n");
				continue;
			}
			result.append("no").append("\n");
		}
		System.out.println(result);
	}
}
