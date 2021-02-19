package bj.silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1074 {
	public static int cnt;
	public static int fy;
	public static int fx;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tokens.nextToken());
		fy = Integer.parseInt(tokens.nextToken());
		fx = Integer.parseInt(tokens.nextToken());
		
		cnt = 0;
		
		int mapsize = (int)Math.pow(2, N);
		
		find(0,0,mapsize-1,mapsize-1);
		
//		System.out.println(map[fy][fx]);		
	}
	public static void find(int x1, int y1, int x2, int y2) {
		if(x1 == fx && y1 == fy) {
			System.out.println(cnt);
			return;
		}
		int rate = (x2-x1+1) * (y2-y1+1) / 4;
//		System.out.println(x1 + " " + y1 + " " + cnt);
		// 1분면?
		if(x1 <= fx && (x1+x2)/2 >= fx && y1 <= fy && (y1+y2)/2 >= fy) {
			cnt += rate * 0; 
			find(x1,y1,(x1+x2)/2,(y1+y2)/2);			
		}
		// 2분면?
		else if((x1+x2)/2+1 <= fx && x2 >= fx && y1 <= fy && (y1+y2)/2 >= fy) {
			cnt += rate * 1;
			find((x1+x2)/2+1,y1,x2,(y1+y2)/2);			
		}
		// 3분면?
		else if(x1 <= fx && (x1+x2)/2 >= fx && (y1+y2)/2+1 <= fy && y2 >= fy) {
			cnt += rate * 2;
			find(x1,(y1+y2)/2+1,(x1+x2)/2,y2);
		}
		// 4분면?
		else if((x1+x2)/2+1 <= fx && x2 >= fx && (y1+y2)/2+1 <= fy && y2 >= fy) {
			cnt += rate * 3;
			find((x1+x2)/2+1,(y1+y2)/2+1,x2,y2);
		}
	}
}
