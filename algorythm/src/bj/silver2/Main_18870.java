package bj.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main_18870 {
	public static void main(String[] args) throws Exception {
		StringBuilder result = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		List<Tree> list = new ArrayList<Tree>();
		List<Tree> list2 = new ArrayList<Tree>();
		
		StringTokenizer tokens = new StringTokenizer(br.readLine());

		for(int i=0; i<n; i++) {
			list.add(new Tree(Integer.parseInt(tokens.nextToken()),i));
		}
		
		Collections.sort(list, new Comparator<Tree>() {
			@Override
			public int compare(Tree o1, Tree o2) {
				if(o1.num < o2.num) {
					return -1;
				}
				else if(o1.num == o2.num){
					return 0;					
				}
				return 1;
			}
		});
		
		int past = 0;
		int pastnum = list.get(0).num;
		list2.add(new Tree(0, list.get(0).idx));
		
		for(int i=1; i<list.size(); i++) {			
			if(list.get(i).num != pastnum) {
				past++;
				pastnum = list.get(i).num;
			}
			list2.add(new Tree(past, list.get(i).idx));
		}

		Collections.sort(list2, new Comparator<Tree>() {
			@Override
			public int compare(Tree o1, Tree o2) {
				if(o1.idx < o2.idx) {
					return -1;
				}
				else if(o1.idx == o2.idx){
					return 0;					
				}
				return 1;
			}
		});
		
		for(int i=0; i<n-1; i++) {
			result.append(list2.get(i).num).append(" ");
		}
		result.append(list2.get(n-1).num);
		
		System.out.println(result);
	}
	
	static class Tree{
		public int num;
		public int idx;
		public Tree(int num, int idx) {
			super();
			this.num = num;
			this.idx = idx;
		}
		public Tree() {
			super();
		}
	}
}
