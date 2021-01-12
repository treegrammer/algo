package bj.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_10773 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		int now = 0;
		for(int i=0; i<k; i++) {
			now = Integer.parseInt(br.readLine());
			if(now == 0) {
				stack.pop();
				continue;
			}
			stack.push(now);
		}
		
		long sum = 0;
		while(!stack.isEmpty()) {
			sum += stack.pop();
		}
		
		System.out.println(sum);
	}
}
