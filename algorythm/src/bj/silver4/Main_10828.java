package bj.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_10828 {
	public static void main(String[] args) throws Exception {
		StringBuilder result = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
//		Stack<Integer> stack = new Stack<Integer>();
//		for(int i=0; i<n; i++) {
//			StringTokenizer tokens = new StringTokenizer(br.readLine());
//			String cmd = tokens.nextToken();
//			switch(cmd) {
//			case "push":
//				stack.push(Integer.parseInt(tokens.nextToken()));
//				break;
//			case "pop":
//				if(stack.isEmpty()) {
//					result.append(-1).append("\n");
//				}
//				else {					
//					result.append(stack.pop()).append("\n");
//				}
//				break;
//			case "size":
//				result.append(stack.size()).append("\n");
//				break;
//			case "empty":
//				if(stack.isEmpty()) {
//					result.append(1).append("\n");
//				}
//				else {
//					result.append(0).append("\n");
//				}
//				break;
//			case "top":
//				if(stack.isEmpty()) {
//					result.append(-1).append("\n");
//				}
//				else {
//					result.append(stack.peek()).append("\n");					
//				}
//				break;
//			}
//		}
		
		T_stack stack = new T_stack();
		for(int i=0; i<n; i++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			String cmd = tokens.nextToken();
			switch(cmd) {
			case "push":
				stack.push(Integer.parseInt(tokens.nextToken()));
				break;
			case "pop":
				result.append(stack.pop()).append("\n");
				break;
			case "size":
				result.append(stack.size()).append("\n");
				break;				
			case "empty":
				result.append(stack.empty()).append("\n");
				break;
			case "top":
				result.append(stack.top()).append("\n");
				break;
			}
		}
		
		System.out.println(result);
	}
	
	static class T_stack{
		List<Integer> list;
		int top;
		public T_stack() {
			list = new ArrayList<Integer>();
			top = -1;
		}
		public void push(int num) {
			list.add(num);
			top++;
		}
		public int pop() {
			int result = -1;
			if(top > -1) {
				result = list.get(top);
				list.remove(top);
				top--;
			}
			return result;
		}
		public int size() {
			return list.size();
		}
		public int empty() {
			if(top > -1) {
				return 0;
			}
			return 1;
		}
		public int top() {
			if(top > -1) {
				return list.get(top);
			}
			return top;
		}
	}
}
