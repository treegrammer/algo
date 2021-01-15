package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class deque {
	public static void main(String[] args) throws Exception {
		StringBuilder result = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		T_deque d = new T_deque();
		for(int i=0; i<n; i++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			String cmd = tokens.nextToken();
			if(cmd.equals("push_front")) {
				d.push_front(Integer.parseInt(tokens.nextToken()));
			}
			else if(cmd.equals("push_back")) {
				d.push_back(Integer.parseInt(tokens.nextToken()));
			}
			else if(cmd.equals("pop_front")) {
				System.out.println(d.pop_front());
			}
			else if(cmd.equals("pop_back")) {
				System.out.println(d.pop_back());
			}
			else if(cmd.equals("size")) {
				System.out.println(d.size());
			}
			else if(cmd.equals("empty")) {
				System.out.println(d.empty());
			}
			else if(cmd.equals("front")) {
				System.out.println(d.front());
			}
			else if(cmd.equals("back")) {
				System.out.println(d.back());
			}
		}
	}
	static class T_deque{
		List<Integer> list;
		public T_deque() {
			list = new LinkedList<Integer>();
		}
		public void push_front(int x) {
			list.add(0, x);
		}
		public void push_back(int x) {
			list.add(x);
		}
		public int pop_front() {
			int result = -1;
			if(this.empty() == 0) {
				result = list.get(0);
				list.remove(0);
			}
			return result;
		}
		public int pop_back() {
			int result = -1;
			if(this.empty() == 0) {
				result = list.get(list.size() - 1);
				list.remove(list.size() - 1);
			}
			return result;
		}
		public int size() {
			return list.size();
		}
		public int empty() {
			if(list.size() == 0) {
				return 1;
			}
			return 0;
		}
		public int front() {
			if(this.empty() == 1) {
				return -1;
			}
			return list.get(0);
		}
		public int back() {
			if(this.empty() == 1) {
				return -1;
			}
			return list.get(list.size() - 1);
		}
	}
}
