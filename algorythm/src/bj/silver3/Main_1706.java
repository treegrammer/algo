package bj.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main_1706 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(tokens.nextToken());
		int c = Integer.parseInt(tokens.nextToken());
		char[][] crr = new char[r][c];
		for(int i=0; i<r; i++) {
			crr[i] = br.readLine().toCharArray();
		}
		
		List<String> list = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		for(int j=0; j<r; j++) {
			for(int i=0; i<c; i++) {
				if(crr[j][i] != '#') {
					sb.append(crr[j][i]);					
				}
				if(crr[j][i] == '#' || i==c-1) {
					if(sb.length() > 1) {
						list.add(sb.toString());
					}
					sb = new StringBuilder();
				}
			}
		}
		
		for(int i=0; i<c; i++) {
			for(int j=0; j<r; j++) {
				if(crr[j][i] != '#') {
					sb.append(crr[j][i]);
				}
				if(crr[j][i] == '#' || j==r-1) {
					if(sb.length() > 1) {
						list.add(sb.toString());
					}
					sb = new StringBuilder();										
				}
			}
		}
		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		Collections.sort(list);
		
		System.out.println(list.get(0));
	}
}
