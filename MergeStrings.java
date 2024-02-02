package leetCodeQuestions;

	public class MergeStrings {
	    public static String mergeStrings(String word1, String word2) {
	        StringBuilder merged = new StringBuilder();
	        int i = 0, j = 0;

	        while (i < word1.length() || j < word2.length()) {
	            if (i < word1.length()) {
	                merged.append(word1.charAt(i));
	                i++;
	            }

	            if (j < word2.length()) {
	                merged.append(word2.charAt(j));
	                j++;
	            }
	        }

	        return merged.toString();
	    }

	    public static void main(String[] args) {
	        // Example 1
	        String word1_1 = "a";
	        String word2_1 = "pqrsdkj";
	        System.out.println(mergeStrings(word1_1, word2_1));

	    }
	
}
