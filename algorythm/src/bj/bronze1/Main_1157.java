package bj.bronze1;

import java.util.Scanner;

public class Main_1157 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next().toUpperCase();
		int[] arr = new int[26];
		int max = 0;
		int max_idx = 0;
		for(int i=0; i<input.length(); i++) {
			int idx = input.charAt(i) - 'A';
			arr[idx]++;
			if(arr[idx] > max) {
				max = arr[idx];
				max_idx = idx;
			}
		}
		int result = max_idx;
		for(int i=0; i<26; i++) {
			if(i == max_idx) {
				continue;
			}
			if(arr[i] == arr[max_idx]) {
				result = -1;
				break;
			}
		}
		if(result == -1) {
			System.out.println("?");
		}
		else {
			System.out.println((char)(result+'A'));
		}
	}
}
