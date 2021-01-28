package study;

//Insertion Sort : ��������
//�������� ���� -> �� ���ڸ� ������ ��ġ�� ��������!
//�ð� ���⵵ : O(N^2)
//�ʿ��� ������ ��ġ�� �ٲٹǷ� ���� ���ĵ� ���¶�� �����ӵ�

public class Sort_Insertion {
	public static void main(String[] args) {
		int[] nums = {1, 10, 5, 8, 7, 6,  4, 3, 2, 9};
		
		// 01 �� ����
		// 01 �� 2 ���ؼ� �´���ġ�� ����
		// 012 �� 3 ���ؼ� �´���ġ�� ���� �ݺ�
		for(int i=0; i<nums.length-1; i++) {
			int now = i;
			while(now>=0 && nums[now] > nums[now+1]) {
				int tmp = nums[now];
				nums[now] = nums[now+1];
				nums[now+1] = tmp;
				now--;
			}
		}
		
		// ������
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
