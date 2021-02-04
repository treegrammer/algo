package bj.silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_1094 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		stack.push(64);
		int len = 64;
		while(len != x) {
			int tmp = stack.pop();
			if(len-tmp/2 >= x) {
				len = len-tmp/2;
				stack.push(tmp/2);
			}
			else {
				stack.push(tmp/2);
				stack.push(tmp/2);
			}			
		}
		System.out.println(stack.size());
	}
}
