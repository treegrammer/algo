package bj.bronze2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_3040 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] nums = new int[9];
		int sum = 0;
		for(int i=0; i<9; i++) {
			nums[i] = Integer.parseInt(br.readLine());
			sum += nums[i];
		}
		
		boolean[] skip = new boolean[9];
		for(int i=0; i<8; i++) {
			for(int j=i+1; j<9; j++) {
				if(sum - nums[i] - nums[j] == 100){
					skip[i] = true;
					skip[j] = true;
				}
			}
		}
		
		for(int i=0; i<9; i++) {
			if(!skip[i]) {
				System.out.println(nums[i]);
			}
		}
	}
}
