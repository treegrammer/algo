package bj.silver1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_2961 {
	public static int min;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		List<Food> list = new ArrayList<Food>();
		for(int i=0; i<N; i++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			int sour = Integer.parseInt(tokens.nextToken());
			int bitter = Integer.parseInt(tokens.nextToken());
			list.add(new Food(sour,bitter));
		}
		
		min = Integer.MAX_VALUE;
		find(0,1,0,list);
		
		bw.write(min + "\n");
		bw.flush();
//		System.out.println(min);
	}
	public static void find(int now, int sour, int bitter, List<Food> list) {
		if(now >= list.size()) {
			if(bitter != 0) {
				int dif = Math.abs(sour-bitter);
				min = min<dif?min:dif;
//				System.out.println(sour + " " + bitter + " " + min);
			}
			return;
		}
		find(now+1, sour*list.get(now).sour, bitter+list.get(now).bitter, list);
		find(now+1, sour, bitter, list);
	}
	static class Food {
		int sour;
		int bitter;
		public Food() {
			super();
		}
		public Food(int sour, int bitter) {
			this.sour = sour;
			this.bitter = bitter;
		}
	}
}
