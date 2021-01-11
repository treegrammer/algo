package bj.silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main_11651 {
	public static void main(String[] args) throws Exception{
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		for(int i=0; i<n; i++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(tokens.nextToken());
			arr[i][1] = Integer.parseInt(tokens.nextToken());
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] < o2[1]) {
					return -1;
				}
				else if(o1[1] == o2[1]) {
					if(o1[0] < o2[0]) {
						return -1;
					}
				}
				return 1;
			}
		});
		
		for(int i=0; i<n; i++) {
			sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
		}
		System.out.println(sb);
	}
}
