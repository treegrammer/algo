package study;

// Selection Sort : ��������
// �������� ���� -> ���� ���� ���� ���� ������ ������!
// �ð� ���⵵ : O(N^2)

public class Sort_Selection {
	public static void main(String[] args) {
		int[] nums = {1, 10, 5, 8, 7, 6,  4, 3, 2, 9};

		// i ~ �� ���� ������ ã�Ƽ� i��° �ڸ��� ��ȯ  �ݺ�
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
		
		// ��� ���
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
