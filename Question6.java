package leetCodeQuestions;

import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first string");
		String str1 = sc.next();
		System.out.println("enter second string");
		String str2 = sc.next();
		sc.close();
		System.out.println(new Question6().solution(str1, str2));
	}

//Function for 
	String solution(String str1, String str2) {
		int count = 0;
		int st1 = str1.length(), st2 = str2.length();
		if (str1.contains(str2)) {
			if (st1 > st2) {
				for (int i = 0; i < st2; i++) {
					count++;
					if (count == 1) {
						char ss[] = new char[st1+st2];
						for (int j = 0; j < str2.length();j++) {
							ss[i]=str2.charAt(j);
						}
					}
				}
				return str2;
			} else if (st1 < st2) {
				return str1;
			} else {
				return "";
			}
		}
		return "worng" + "dnjknf";
	}
}
