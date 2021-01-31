package bj.silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main_10814 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<User> list = new ArrayList<User>();
		for(int i=0; i<n; i++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			int age = Integer.parseInt(tokens.nextToken());
			String name = tokens.nextToken();
			list.add(new User(age, name));
		}
		
		Collections.sort(list, new Comparator<User>() {
			public int compare(User o1, User o2) {
				if(o1.age < o2.age) {
					return -1;
				}
				if(o1.age == o2.age) {
					return 0;
				}
				return 1;
			}
		});
		
		
		StringBuilder result = new StringBuilder();
		for(int i=0; i<list.size(); i++) {
			result.append(list.get(i).age).append(" ").append(list.get(i).name).append("\n");
		}
		System.out.println(result);
	}
	static class User{
		public int age;
		public String name;
		public User() {
			super();
		}
		public User(int age, String name) {
			this.age = age;
			this.name = name;
		}
	}
}
