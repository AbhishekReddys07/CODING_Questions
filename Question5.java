package leetCodeQuestions;

import java.util.ArrayList;
import java.util.Iterator;

/* Question : You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
 *  starting with word1.If a string is longer than the other, append the additional letters onto the end of the merged string.
 */
public class Question5 {
	public static void main(String[] args) {
		String word1 = "ab";
		String word2 = "pqrs";

		Question5 q = new Question5();
		String ans = q.Solution(word1, word2);
		System.out.println(ans);
	}

	public String Solution(String word1, String word2) {
		String str="";
		ArrayList <Object>ar=new ArrayList<Object>();
		for (int i = 0; i < word1.length(); i++) {
			if(i>=0){
				ar.add(word1.charAt(i));
			}
			for (int j = 0; j < word2.length(); j++) {
			if(j>=0){
				ar.add(word2.charAt(j));
			}else if(i>j){
				ar.add(word2.concat(word2));
			}
			}
			}
		for (Object element : ar) {
			  str += element;
			 
			}
		return str;
	}

}
