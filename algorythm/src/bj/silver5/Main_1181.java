package bj.silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_1181 {
	public static void main(String[] args) throws Exception {
		StringBuilder result = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<String> list = new LinkedList<String>();
		for(int i=0; i<n; i++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			list.add(tokens.nextToken());
		}
		
		Collections.sort(list, new Comparator<String>() {

			public int compare(String o1, String o2) {
				if(o1.length() < o2.length()) {
					return -1;
				}
				if(o1.length() == o2.length()) {
					for(int i=0; i<o1.length(); i++) {
						if(o1.charAt(i) < o2.charAt(i)) {
							return -1;
						}
						if(o1.charAt(i) > o2.charAt(i)) {							
							return 1;
						}
					}
				}
				return 1;
			}
			
		});
		
		for(int i=0; i<list.size(); i++) {
			if(i<list.size()-1 && list.get(i).equals(list.get(i+1))) {
				continue;
			}
			result.append(list.get(i)).append("\n");
		}
		System.out.println(result);
	}
}
