package bj.bronze3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_4153 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder result = new StringBuilder();
		
		int[] arr = new int[3];
		while(true) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(tokens.nextToken());
			int b = Integer.parseInt(tokens.nextToken());
			int c = Integer.parseInt(tokens.nextToken());
			if(a == 0 && b == 0 && c == 0) {
				break;
			}
			
			arr[0] = a;
			arr[1] = b;
			arr[2] = c;
			Arrays.sort(arr);
			
			if(arr[2] * arr[2] == arr[0] * arr[0] + arr[1] * arr[1]) {
				result.append("right").append("\n");
				continue;
			}
			result.append("wrong").append("\n");
		}
		
		System.out.println(result);
	}
}
