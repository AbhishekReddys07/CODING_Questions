package leetCodeQuestions;

import java.util.ArrayList;
import java.util.List;


//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//Explanation: 342 + 465 = 807.
public class Question2 {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		
		List<Integer> l2 = new ArrayList<>();
		l2.add(40);
		l2.add(50);
		l2.add(60);
		
		System.out.println(new Solution1().addTwoNumbers(l1, l2));
	}
}

class Solution1 {
	
	public int addTwoNumbers(List<Integer> l1, List<Integer> l2) {
		int ann=0;
		int ann1=0;
	int arr[]=new int[l1.size()];
	int arr1[]=new int[l2.size()];
	for (int i = 0; i < l1.size(); i++) {
		arr[i]=(int)l1.get(i);
		ann+=arr[i];
		//System.out.print(ann);
	}

	for (int i = 0; i < l2.size(); i++) {
		arr1[i]=(int)l2.get(i);
		ann1+=arr1[i];
		//System.out.print(ann1);
	}
	
	int answer=ann+ann1;

		return answer;

	}
	}
