import java.util.Arrays;

public class MergeSortOptimized {
    public static void main(String[] args) {
        int nums[] = { 11, 5, 7, 2, 23, 10, 8, 1 };
        int temp[] = new int[nums.length];

        mergeSort(nums, temp, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void mergeSort(int[] nums, int[] temp, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(nums, temp, left, mid);
            mergeSort(nums, temp, mid + 1, right);

            merge(nums, temp, left, mid, right);
        }
    }

    private static void merge(int[] nums, int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int counter = left;

        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[counter++] = nums[i++];
            } else {
                temp[counter++] = nums[j++];
            }
        }

        while (i <= mid)
            temp[counter++] = nums[i++];

        while (j <= right)
            temp[counter++] = nums[j++];

        for (int x = left; x <= right; x++) {
            nums[x] = temp[x];
        }
    }
}
