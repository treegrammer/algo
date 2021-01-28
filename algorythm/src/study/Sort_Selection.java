package study;

// Selection Sort : 선택정렬
// 오름차순 정렬 -> 가장 작은 수를 제일 앞으로 보내자!
// 시간 복잡도 : O(N^2)

public class Sort_Selection {
	public static void main(String[] args) {
		int[] nums = {1, 10, 5, 8, 7, 6,  4, 3, 2, 9};

		// i ~ 끝 가장 작은수 찾아서 i번째 자리와 교환  반복
		for(int i=0; i<nums.length; i++) {
			int min = Integer.MAX_VALUE;
			int idx = 0;
			for(int j=i; j<nums.length; j++) {
				if(min > nums[j]) {
					min = nums[j];
					idx = j;
				}
			}
			int tmp = nums[i];
			nums[i] = nums[idx];
			nums[idx] = tmp;
		}
		
		// 결과 출력
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
