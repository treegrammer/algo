package study;

//Binary Search : 이분탐색
//정렬된 값에서 원하는 값 찾기 -> 아닌 값은 반씩 버려서 찾아보자!
//시간 복잡도 : O(logN)

public class Search_Binary {
	public static void main(String[] args) throws Exception {
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// 1 2 3 4 5 6 7 8 9 10
		// left = 0(1) / right = 9(10) / mid = 4(5)
		// mid(5)가 find(1)보다 크면 mid(5)보다 큰값은 버림
		// left = 0(1) / right = mid-1 = 3(4)
		// mid(5)가 find(7)보다 작으면 mid(5)보다  작은값은 버림
		// left = mid+1 = 5(6) / right = 9(10)
		// 반복
		int num = nums[nums.length / 2];
		int find = 10;
		int left = 0;
		int right = nums.length - 1;
		while(num != find) {
			if(left > right) {
				num = -1;
				break;
			}
			int mid = (left + right)/2;
			num = nums[mid];
			if(num < find) {
				left = num+1;
			}
			if(num > find) {
				right = num-1;
			}
			if(num == find) {
				// 찾았다!!
				num = 1;
				break;
			}
		}
		
		// 결과출력
		System.out.println(num);
	}
}
