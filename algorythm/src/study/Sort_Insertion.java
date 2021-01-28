package study;

//Insertion Sort : 삽입정렬
//오름차순 정렬 -> 각 숫자를 적절한 위치에 삽입하자!
//시간 복잡도 : O(N^2)
//필요할 때에만 위치를 바꾸므로 거의 정렬된 상태라면 빠른속도

public class Sort_Insertion {
	public static void main(String[] args) {
		int[] nums = {1, 10, 5, 8, 7, 6,  4, 3, 2, 9};
		
		// 01 비교 정렬
		// 01 에 2 비교해서 맞는위치에 삽입
		// 012 에 3 비교해서 맞는위치에 삽입 반복
		for(int i=0; i<nums.length-1; i++) {
			int now = i;
			while(now>=0 && nums[now] > nums[now+1]) {
				int tmp = nums[now];
				nums[now] = nums[now+1];
				nums[now+1] = tmp;
				now--;
			}
		}
		
		// 결과출력
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
