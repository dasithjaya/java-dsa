import java.util.Arrays;

//+ Time complexity -> O(n^2)

public class BubbleSort {
    public static void main(String[] args) {
        int nums[] = { 11, 5, 7, 2, 23, 10, 8, 1 };

        int res_dsc[] = bubbleSortDsc(nums);
        System.out.println(Arrays.toString(res_dsc));
    }

    public static int[] bubbleSortAsc(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                }
            }
        }
        return nums;
    }

    public static int[] bubbleSortDsc(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] < nums[j + 1]) {
                    swap(nums, j, j + 1);
                }
            }
        }
        return nums;
    }

    public static void swap(int[] arr, int from, int to) {
        int temp = arr[to];
        arr[to] = arr[from];
        arr[from] = temp;
    }
}
