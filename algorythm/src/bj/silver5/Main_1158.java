package bj.silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1158 {
	public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        StringTokenizer tokens = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(tokens.nextToken());
        int K = Integer.parseInt(tokens.nextToken());
        
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i=1; i<=N; i++){
            q.add(i);
        }
        
        result.append("<");
        while(q.size() > 1){
            for(int i=0; i<K-1; i++){
                q.offer(q.poll());
            }
            result.append(q.poll()).append(", ");
        }
        result.append(q.poll()).append(">");
        
        System.out.println(result);
    }
}
