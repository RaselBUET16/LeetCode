class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int finalArr[] = new int[m+n];
        int i = 0, j = 0, k = 0;

        while(true) {
            if (i == m || j == n) {
                break;
            }
            if (nums1[i] > nums2[j]){
                finalArr[k] = nums2[j];
                j++;
            } else {
                finalArr[k] = nums1[i];
                i++;
            }
            k++;
        }
        if (i < m) {
            for ( ; i < m ; i++){
                finalArr[k++] = nums1[i];
            }
        }
        if (j < n) {
            for (; j < n ; j++){
                finalArr[k++] = nums2[j];
            }
        }
        for (i = 0 ; i < m+n ; i++){
            nums1[i] = finalArr[i];
        }

    }
}
