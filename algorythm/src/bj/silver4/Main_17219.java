package bj.silver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main_17219 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tokens.nextToken());
		int M = Integer.parseInt(tokens.nextToken());
		HashMap<String,String> map = new HashMap<String,String>();
		
		for(int i=0; i<N; i++) {
			tokens = new StringTokenizer(br.readLine());
			map.put(tokens.nextToken(), tokens.nextToken());
		}
		
		StringBuilder result = new StringBuilder();
		for(int j=0; j<M; j++) {
			result.append(map.get(br.readLine())).append("\n");
		}
		
//		System.out.println(result);
		bw.write(result.toString());
		bw.flush();
		bw.close();
	}
}
