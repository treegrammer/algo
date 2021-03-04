package bj.Gold5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main_15686 {
	public static int[][] Map;
	public static int N;
	public static int M;
	public static int result;
	public static int[] array;
	public static List<Loc> chicken;
	public static List<Loc> city;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		chicken = new ArrayList<Loc>();
		city = new ArrayList<Loc>();
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		N = Integer.parseInt(tokens.nextToken());
		M = Integer.parseInt(tokens.nextToken());
		array = new int[M];
		Map = new int[N][N];
		result = Integer.MAX_VALUE;
		for(int i=0; i<N; i++) {
			tokens = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				int now = Integer.parseInt(tokens.nextToken());
				if(now == 1) {
					city.add(new Loc(i,j));
				}
				else if(now == 2) {
					chicken.add(new Loc(i,j));
				}
			}
		}
		
		nCm(0,0);
		
		// chicken.size() 중 M개 선택
		// Map에 최소거리 최신화
		// 치킨거리 합해서 최솟값 최신화
		
		System.out.println(result);
	}
	public static void nCm(int now, int cnt) {
		if(cnt == M) {
//			System.out.println(Arrays.toString(array));
			for(int t=0; t<M; t++) {
				Loc c = chicken.get(array[t]);
				for(int k=0; k<city.size(); k++) {
					Loc n = city.get(k);
					int dist = Math.abs(c.y-n.y) + Math.abs(c.x-n.x);
					if(Map[n.y][n.x] == 0) {
						Map[n.y][n.x] = dist; 
					}
					else {
						Map[n.y][n.x] = Map[n.y][n.x]<dist?Map[n.y][n.x]:dist; 												
					}
				}
			}
			int min = 0;
			for(int i=0; i<N; i++) {
//				System.out.println(Arrays.toString(Map[i]));
				for(int j=0; j<N; j++) {
					min += Map[i][j];
					Map[i][j] = 0;
				}
			}
			result = result<min?result:min;
			return;
		}
		if(now >= chicken.size()) {
			return;
		}
		nCm(now+1,cnt);
		array[cnt] = now;
		nCm(now+1,cnt+1);
		array[cnt] = 0;
	}
	static class Loc{
		int y;
		int x;
		public Loc(int y, int x) {
			super();
			this.y = y;
			this.x = x;
		}
	}
}
