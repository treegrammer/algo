package bj.silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_2609 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(tokens.nextToken());
		int b = Integer.parseInt(tokens.nextToken());
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		// 약수구하기
		int tmp = a;
		for(int i=2; i<=tmp; i++) {
			if(tmp % i == 0) {
				list1.add(i);
				tmp = tmp / i;
				i = 1;
			}
		}
		
		tmp = b;
		for(int i=2; i<=tmp; i++) {
			if(tmp % i == 0) {
				list2.add(i);
				tmp = tmp / i;
				i = 1;
			}
		}
		
//		for(int i=0; i<list1.size(); i++) {
//			System.out.print(list1.get(i) + " ");
//		}
//		System.out.println();
//		for(int i=0; i<list2.size(); i++) {
//			System.out.print(list2.get(i) + " ");
//		}
//		System.out.println();
		
		// 최대공약수
		int result1 = 1;
		for(int i=0; i<list1.size(); i++) {
			for(int j=0; j<list2.size(); j++) {
				if(list1.get(i).equals(list2.get(j))) {
					result1 *= list2.get(j);
					list2.remove(j);
					break;
				}
			}
		}
		
		// 최소공배수
		int result2 = 1;
		for(int i=0; i<list1.size(); i++) {
			result2 *= list1.get(i);
		}
		for(int j=0; j<list2.size(); j++) {
			result2 *= list2.get(j);
		}
		
		System.out.println(result1);
		System.out.print(result2);

	}
}
