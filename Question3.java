package leetCodeQuestions;


import java.util.ArrayList;

//CASE 1
//Input: nums1 = [1,3], nums2 = [2]
//Output: 2.00000
//Explanation: merged array = [1,2,3] and median is 2.

//CASE 2
//Input: nums1 = [1,2], nums2 = [3,4]
//Output: 2.50000
//Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

public class Question3 {
	public static void main(String[] args) {
		Question3Solution q = new Question3Solution();
		int nums1[] = { 1, 2 }, nums2[] = { 3, 4 };
		double result = (int) q.findMedianSortedArrays(nums1, nums2);
		System.out.println(result);
	}

}

class Question3Solution {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < nums1.length; i++) {
			if (nums1[i] != 0) {
				al.add(nums1[i]);
				try {
					al.add(nums2[i]);
				} catch (Exception e) {
				}
			}
		}
		ArrayList<Integer> merge = new ArrayList<Integer>();
		merge.addAll(al);

		int result[] = new int[merge.size()];

		for (int i = 0; i < result.length; i++) {
			result[i] = merge.get(i);
		}

		int compare = result.length;
		if (compare / 2 == 1) {
			System.out.println("IYSSUIA");
			return (double) result[compare / 2];
		}
			return (double) result[1];
		
	}
}
