import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main_11723 {
	public static void main(String[] args) throws Exception {
		StringBuilder result = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> set = new HashSet<Integer>();

		int cl = Integer.parseInt(br.readLine());
		for(int c=0; c<cl; c++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			String cmd = tokens.nextToken();
			switch(cmd) {
			case "add":
				set.add(Integer.parseInt(tokens.nextToken()));
				break;
			case "remove":
				set.remove(Integer.parseInt(tokens.nextToken()));
				break;
			case "check":
				if(set.contains(Integer.parseInt(tokens.nextToken()))) {
					result.append("1");
				}
				else {
					result.append("0");
				}
				result.append("\n");
				break;
			case "toggle":
				int num = Integer.parseInt(tokens.nextToken());
				if(set.contains(num)) {
					set.remove(num);
				}
				else {
					set.add(num);
				}
				break;
			case "all":
				set.clear();
				for(int i=1; i<=20; i++) {
					set.add(i);
				}
				break;
			case "empty":
				set.clear();
				break;
			}
		}
		System.out.println(result);
	}
}
