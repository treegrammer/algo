package bj.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_18310 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] house = new int[N];
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			house[i] = Integer.parseInt(tokens.nextToken());
		}
		
		Arrays.sort(house);

		int result = house[N/2-1];
		
		System.out.println(result);
	}
}
