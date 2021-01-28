package study;

//Bubble Sort : 버블정렬
//오름차순 정렬 -> 옆에  값과 비교해서 더 작은 값을 앞으로 보내자!
//시간 복잡도 : O(N^2)

public class Sort_Bubble {
	public static void main(String[] args) {
		int[] nums = {1, 10, 5, 8, 7, 6,  4, 3, 2, 9};
		
		// 마지막번호가 가장 작을수 있으니 두숫자씩 비교해서 옮기는걸 번호갯수만큼 반복
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums.length-1; j++) {
				if(nums[j] > nums[j+1]) {
					int tmp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = tmp;
				}
			}
		}
		
		// 결과출력
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
