package bj.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2606 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		int[] comps = new int[n+1];
		for(int i=1; i<=n; i++) {
			comps[i] = i;
		}
		
		for(int i=0; i<m; i++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(tokens.nextToken());
			int b = Integer.parseInt(tokens.nextToken());
			union(comps,a,b);
		}
//		
//		for(int i=1; i<=n; i++) {
//			System.out.print(comps[i] + " ");			
//		}
		
		int result = 0;
		for(int i=2; i<=n; i++) {
			if(find(comps,1) == find(comps,i)) {
				result++;
			}
		}
		System.out.println(result);
	}
	public static int find(int[] arr, int a) {
		if(arr[a] == a) {
			return a;
		}
		return find(arr, arr[a]);
	}
	public static void union(int[] arr, int a, int b) {
		arr[find(arr,a)] = find(arr,b);
	}
}
