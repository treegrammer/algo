package bj.Gold5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main_7662 {
	public static void main(String[] args) throws Exception {
		StringBuilder result = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=t; tc++) {
			int k = Integer.parseInt(br.readLine());
			TreeMap<Integer, Integer> map = new TreeMap<>();
			
			for(int i=0; i<k; i++) {
				StringTokenizer tokens = new StringTokenizer(br.readLine());
				char cmd = tokens.nextToken().charAt(0);
				int num = Integer.parseInt(tokens.nextToken());
				if(cmd == 'I') {
					if(!map.containsKey(num)) {
						map.put(num, 1);
					}
					else {
						map.put(num, map.get(num)+1);						
					}
				}
				else if(cmd == 'D') {
					if(map.isEmpty()) {
						continue;
					}
					if(num == -1) {
						if(map.get(map.firstKey()) == 1) {
							map.remove(map.firstKey());							
						}
						else {
							map.put(map.firstKey(), map.get(map.firstKey()) - 1);
						}
					}
					else if(num == 1) {
						if(map.get(map.lastKey()) == 1) {
							map.remove(map.lastKey());							
						}
						else {
							map.put(map.lastKey(), map.get(map.lastKey()) - 1);
						}
					}						
				}
				
//				for(int l=0; l<map.size();  l++) {
//					System.out.println(map.toString());
//				}
			}
//			System.out.println();
			
			if(map.isEmpty()) {
				result.append("EMPTY").append("\n");
			}
			else {
				result.append(map.lastKey())
						.append(" ")
						.append(map.firstKey())
						.append("\n");
			}
		}
		System.out.println(result);
	}
}
