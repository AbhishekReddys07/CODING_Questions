package leetCodeQuestions;

class Question7 {
    public int removeDuplicates(int[] nums){
    	 int ans=1;
     	for (int i = 1; i < nums.length; i++) {
             if(nums[i]!=nums[i-1]){
                 nums[ans]=nums[i];
                 System.out.println(nums[i]+ " "+nums[ans]);
                 ans++;
             }
 		}
     return ans;
   
    }
    public static void main(String[] args) {
    	int nums[] = {1,1,1,2,2,3};
		Question7 sun=new Question7();
		System.out.println(sun.removeDuplicates(nums));
		
	}
}
