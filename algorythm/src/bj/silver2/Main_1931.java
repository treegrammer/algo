package bj.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main_1931 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Tree> list = new ArrayList<Tree>();
		for(int i=0; i<n; i++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			Tree now = new Tree();
			now.s = Integer.parseInt(tokens.nextToken());
			now.e = Integer.parseInt(tokens.nextToken());
			list.add(now);
		}
		
		Collections.sort(list, new Comparator<Tree>() {
			@Override
			public int compare(Tree o1, Tree o2) {
				if(o1.e < o2.e) {
					return -1;
				}
                else if(o1.e == o2.e){
                    if(o1.s < o2.s){
                        return -1;
                    }
                }
				return 1;
			}
		});
		
		int result = 0;
		int start = 0;
		int end = -1;
		for(int i=0; i<n; i++) {
			start = list.get(i).s;
			if(start >= end) {
				end = list.get(i).e;
				result++;
			}
		}

		System.out.println(result);
	}
	static class Tree{
		public int s;
		public int e;
	}
}