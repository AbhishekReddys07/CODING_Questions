package leetCodeQuestions;

public class Question4 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
                System.out.println( nums1[k--] = nums1[i--]);
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);

        // Print the merged array
        System.out.print("[");
        for (int i = 0; i < m + n; i++) {
            System.out.print(nums1[i]);
            if (i < m + n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
