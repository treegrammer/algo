package study;

//Bubble Sort : ��������
//�������� ���� -> ����  ���� ���ؼ� �� ���� ���� ������ ������!
//�ð� ���⵵ : O(N^2)

public class Sort_Bubble {
	public static void main(String[] args) {
		int[] nums = {1, 10, 5, 8, 7, 6,  4, 3, 2, 9};
		
		// ��������ȣ�� ���� ������ ������ �μ��ھ� ���ؼ� �ű�°� ��ȣ������ŭ �ݺ�
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums.length-1; j++) {
				if(nums[j] > nums[j+1]) {
					int tmp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = tmp;
				}
			}
		}
		
		// ������
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
