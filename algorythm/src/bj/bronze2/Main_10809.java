package bj.bronze2;

import java.util.Scanner;

public class Main_10809 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int[] arr = new int['z'-'a'+1];

		for(int i=0; i<input.length(); i++) {
			int tmp = input.charAt(i) - 'a';
			if(arr[tmp] == 0) {
				arr[tmp] = i+1;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i]-1).append(" ");
		}
		
		System.out.println(sb);
	}
}
