package bj.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_1874 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		StringBuilder result = new StringBuilder();
		int idx = 0;
		boolean ck = true;
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=1; i<=n; i++) {
			// i와 idx의 값이 같으면 pop
			while(!stack.isEmpty() && stack.peek() == arr[idx]) {
				stack.pop();
				result.append("-").append("\n");
				idx++;
			}
			// i보다 idx의 값이 큰 값일때 일단 push
			if(i <= arr[idx]) {
				stack.push(i);
				result.append("+").append("\n");
				continue;
			}
			ck = false;
			break;
		}
		if(ck) {
			while(!stack.isEmpty()) {
				if(stack.pop() != arr[idx++]) {
					ck = false;
					break;
				}
				result.append("-").append("\n");				
			}
		}
		if(!ck) {
			result = new StringBuilder();
			result.append("NO");
		}
		
		System.out.println(result);
	}
}
