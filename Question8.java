package leetCodeQuestions;

public class Question8 {
	public static void main(String[] args) {
		int nums[] = { 0,0,1,1,1,1,2,3,3};

		System.out.println(new Question8().solution(nums));
	}

	int solution(int[] nums) {
		
		 if (nums.length == 0) {
	            return 0;
	        }
	        
	        int k = 1; 
	        int count = 1; 
	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] == nums[i - 1]) {
	                count++;
	            } else {
	                count = 1;
	            }
	            
	            if (count <= 2) {
	                nums[k] = nums[i];
	                System.out.println(nums[k]);
	                k++;
	            }
	        }
	        
	        return k;
	    }

}
