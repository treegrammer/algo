package bj.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1780 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][n];
		boolean mixed = false;
		for(int i=0; i<n; i++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				arr[i][j] = Integer.parseInt(tokens.nextToken());
			}
		}
		
		// que로 만들어서 넣고 빼고 넣고빼고 하자
		Queue<int[][]> q = new LinkedList<int[][]>();
		q.offer(arr);
		
		// -1 0 1
		int[] result = new int[3];
		
		while(!q.isEmpty()) {
			arr = q.poll();
			
			// mix 확인
			mixed = false;
			int tmp = arr[0][0];
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[0].length; j++) {
					if(tmp != arr[i][j]) {
						mixed = true;
						break;
					}
				}
				if(mixed) {
					break;
				}
			}
			
			// !mix면 숫자 찾아 result ++
			if(!mixed) {
				result[tmp+1]++;
//				System.out.println("찾았어" + tmp);
				continue;
			}
			
			// mix면 3등분해서 q.offer
//			System.out.println("조각조각");
			for(int di=0; di<3; di++) {
				for(int dj=0; dj<3; dj++) {					
					int[][] narr = new int[arr.length/3][arr[0].length/3];
					int tka = arr.length/3;
					for(int i=0; i<tka; i++) {
						for(int j=0; j<tka; j++) {
							narr[i][j] = arr[tka*di + i][tka*dj +j];
						}
					}
					q.offer(narr);
				}
			}
			
		}
		
		
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(result[2]);
		
		
	}
}
