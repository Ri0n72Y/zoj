import java.util.Arrays;

public class leetCode004 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;

        double median = 0;
        if (n == 0 && m != 0) {
            return (m % 2 == 0) ? (nums2[m / 2] + nums2[m / 2 - 1]) / 2.0d : (double) nums2[m / 2];
        } else if (m == 0 && n != 0) {
            return (n % 2 == 0) ? (nums1[n / 2] + nums1[n / 2 - 1]) / 2.0d : (double) nums1[n / 2];
        }

        if (n == 1 && m == 1) {
            return (nums1[0] + nums2[0]) / 2.0d;
        } else if (n == 1) {
            int[] s = new int[m + 1];
            System.arraycopy(nums2, 0, s, 0, m);
            s[m] = nums1[0];

            Arrays.sort(s);
            return s[s.length / 2];
        } else if (m == 1) {
            int[] s = new int[n + 1];
            System.arraycopy(nums1, 0, s, 0, n);
            s[n] = nums2[0];

            Arrays.sort(s);
            return s[s.length / 2];
        }

        if (nums1[0] < nums2[0] && nums1[n - 1] > nums2[m - 1]) {
            return getMedian(nums2);
        } else if (nums1[0] > nums2[0] && nums1[n - 1] < nums2[m - 1]) {
            return getMedian(nums1);
        }


        double median1 = getMedian(nums1), median2 = getMedian(nums2);
        if (median1 < median2) {
            median = findMedianSortedArrays(Arrays.copyOfRange(nums1, n / 2, n), Arrays.copyOfRange(nums2, 0, m / 2));
        } else if (median1 > median2) {
            median = findMedianSortedArrays(Arrays.copyOfRange(nums1, 0, n / 2), Arrays.copyOfRange(nums2, m / 2, m));
        } else if (median1 == median2) {

            median = getMedian(nums1);
        }
        return median;
    }

    static double getMedian(int[] nums) {
        return (nums.length % 2 == 0) ? (nums[nums.length / 2] + nums[nums.length / 2 - 1]) / 2.0d : (double) nums[nums.length / 2];
    }

    public static void main(String[] args) {
        int[] nums1 = new int[] {1, 2};
        int[] nums2 = new int[] {-1, 3};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
