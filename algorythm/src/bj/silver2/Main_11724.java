package bj.silver2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11724 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(tokens.nextToken());
		int m = Integer.parseInt(tokens.nextToken());
		
		int[] parents = new int[n];
		for(int i=0; i<n; i++) {
			parents[i] = i;
		}
		
		for(int i=0; i<m; i++) {
			tokens = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(tokens.nextToken())-1;
			int b = Integer.parseInt(tokens.nextToken())-1;
			union(parents,a,b);
		}
		
		int result = 0;
		for(int i=0; i<n; i++) {
			if(parents[i] == i) {
				result++;
			}
		}
		
		System.out.println(result);
	}
	public static int find(int[] parents, int x) {
		if(parents[x] == x) {
			return x;
		}
		return find(parents, parents[x]);
	}
	public static void union(int[] parents, int a, int b) {
		a = find(parents, a);
		b = find(parents, b);
		parents[b] = a;
	}
}
