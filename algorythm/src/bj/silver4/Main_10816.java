package bj.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main_10816 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Long,Integer> map = new HashMap<>();
		StringBuilder result = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			long num = Long.parseLong(tokens.nextToken());
			if(map.containsKey(num)) {
				map.put(num, map.get(num)+1);				
			}
			else {
				map.put(num, 1);
			}
		}
		int m = Integer.parseInt(br.readLine());
		tokens = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			long num = Long.parseLong(tokens.nextToken());
			if(map.containsKey(num)) {
				result.append(map.get(num)).append(" ");
			}
			else {
				result.append(0).append(" ");
			}
		}
		
		System.out.println(result);
	}
}
