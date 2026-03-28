import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int nums[] = { 11, 5, 7, 2, 23, 10, 8, 1 };
        mergeSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void mergeSort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid + 1, right);

            merge(nums, left, mid, right);
        }
    }

    private static void merge(int[] nums, int left, int mid, int right) {
        int arr_1_size = mid - left + 1;
        int arr_2_size = right - mid;

        int left_arr[] = new int[arr_1_size];
        int right_arr[] = new int[arr_2_size];

        for (int i = 0; i < arr_1_size; i++) {
            left_arr[i] = nums[left + i];
        }

        for (int i = 0; i < arr_2_size; i++) {
            right_arr[i] = nums[mid + i + 1];
        }

        int i = 0;
        int j = 0;
        int counter = left;

        while (i < arr_1_size && j < arr_2_size) {
            if (left_arr[i] < right_arr[j]) {
                nums[counter] = left_arr[i];
                i++;
            } else {
                nums[counter] = right_arr[j];
                j++;
            }
            counter++;
        }

        while (i < arr_1_size) {
            nums[counter] = left_arr[i];
            i++;
            counter++;
        }

        while (j < arr_2_size) {
            nums[counter] = right_arr[j];
            j++;
            counter++;
        }
    }
}
