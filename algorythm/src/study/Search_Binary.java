package study;

//Binary Search : �̺�Ž��
//���ĵ� ������ ���ϴ� �� ã�� -> �ƴ� ���� �ݾ� ������ ã�ƺ���!
//�ð� ���⵵ : O(logN)

public class Search_Binary {
	public static void main(String[] args) throws Exception {
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// 1 2 3 4 5 6 7 8 9 10
		// left = 0(1) / right = 9(10) / mid = 4(5)
		// mid(5)�� find(1)���� ũ�� mid(5)���� ū���� ����
		// left = 0(1) / right = mid-1 = 3(4)
		// mid(5)�� find(7)���� ������ mid(5)����  �������� ����
		// left = mid+1 = 5(6) / right = 9(10)
		// �ݺ�
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
				// ã�Ҵ�!!
				num = 1;
				break;
			}
		}
		
		// ������
		System.out.println(num);
	}
}
