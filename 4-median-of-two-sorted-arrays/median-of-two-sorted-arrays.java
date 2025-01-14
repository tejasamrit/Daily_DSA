class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
    int m = nums2.length;
    int mergedArr[] = new int[n + m];
    int i = 0, j = 0, k = 0;

    // Merge the two arrays
    while (i < n && j < m) {
        if (nums1[i] <= nums2[j]) {
            mergedArr[k++] = nums1[i++];
        } else {
            mergedArr[k++] = nums2[j++];
        }
    }

    // Copy remaining elements
    while (i < n) {
        mergedArr[k++] = nums1[i++];
    }
    while (j < m) {
        mergedArr[k++] = nums2[j++];
    }

    // Find the median
    int len = mergedArr.length;
    if (len % 2 == 1) {
        return mergedArr[len / 2]; // Middle element for odd length
    } else {
        return (mergedArr[len / 2 - 1] + mergedArr[len / 2]) / 2.0; // Average of two middle elements for even length
    }
    }
}