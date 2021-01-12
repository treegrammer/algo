package bj.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_2108 {
	public static void main(String[] args) throws Exception{
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int n = Integer.parseInt(br.readLine());
		
		// 산술평균
		long sum = 0;
		// 중앙값
		int[] arr = new int[n];
		// 최빈값 : 4000을 0으로 생각
		int[] cnt = new int[8001];
		// 범위
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
			cnt[arr[i]+4000]++;
		}
		
		Arrays.sort(arr);
		
		int max = -4001;
		int idx = 0;
		for(int i=0; i<8001; i++) {
			if(cnt[i] > max) {
				max = cnt[i];
				idx = i;
				continue;
			}
		}
		for(int i=idx+1; i<8001; i++) {
			if(cnt[i] == max) {
				idx = i;
				break;
			}
		}
		
		sb.append(Math.round((float)sum/n)).append("\n");
		sb.append(arr[n/2]).append("\n");
		sb.append(idx-4000).append("\n");
		sb.append(arr[n-1] - arr[0]).append("\n");
		
		System.out.println(sb);
	}
}
