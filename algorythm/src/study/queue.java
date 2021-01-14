package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class queue {
	public static void main(String[] args) throws Exception {
		StringBuilder result = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		T_queue q = new T_queue();
		for(int i=0; i<n; i++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			String cmd = tokens.nextToken();
			switch(cmd) {
			case "push":
				q.push(Integer.parseInt(tokens.nextToken()));
				break;
			case "pop":
				result.append(q.pop()).append("\n");
				break;
			case "size":
				result.append(q.size()).append("\n");
				break;
			case "empty":
				result.append(q.empty()).append("\n");
				break;
			case "front":
				result.append(q.front()).append("\n");
				break;
			case "back":
				result.append(q.back()).append("\n");
				break;
			}
		}
		System.out.println(result);
	}
	static class T_queue{
		List<Integer> list;
		public T_queue() {
			list = new ArrayList<Integer>();
		}
		public void push(int num) {
			list.add(num);
		}
		public int pop() {
			int result = -1;
			if(this.empty() == 0) {
				result = list.get(0);
				list.remove(0);
			}
			return result;
		}
		public int size() {
			return list.size();
		}
		public int empty() {
			int result = 1;
			if(list.size() > 0) {
				result = 0;
			}
			return result;
		}
		public int front() {
			int result = -1;
			if(this.empty() == 0) {
				result = list.get(0);
			}
			return result;
		}
		public int back() {
			int result = -1;
			if(this.empty() == 0) {
				result = list.get(list.size() - 1);
			}
			return result;
		}
	}
	
}
