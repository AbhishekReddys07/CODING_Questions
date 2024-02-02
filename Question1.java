package leetCodeQuestions;

//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

public class Question1 {
	public static void main(String[] args) {
		int nums[] = { 12,2 ,11,9,8,3,8,2,10,1 };
		int target = 3;

		Solution s = new Solution();
		 int[] i=s.twoSum(nums, target);
		 for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
	}

}



class Solution {
	public int [] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length;j++) {
				  int  answer=(nums[i]+nums[j]);
				  if(answer ==target){
		              return new int[]{i,j};
				
		          }
		     	}
		     } 
		    return null;
	}
}
