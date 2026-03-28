import java.util.Arrays;

//+ Time complexity -> O(n^2)

public class SelectionSort {
    public static void main(String[] args) {
        int nums[] = { 11, 5, 7, 2, 23, 10, 8, 1 };

        int asc_res[] = selectionSortAsc(nums);
        System.out.println(Arrays.toString(asc_res));

        int dsc_res[] = selectionSortDsc(nums);
        System.out.println(Arrays.toString(dsc_res));
    }

    public static int[] selectionSortAsc(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min_index]) {
                    min_index = j;
                }
            }
            swap(nums, i, min_index);
        }
        return nums;
    }

    public static int[] selectionSortDsc(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            int max_index = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[max_index]) {
                    max_index = j;
                }
            }
            swap(nums, i, max_index);
        }
        return nums;
    }

    public static int[] swap(int[] arr, int from, int to) {
        int temp = arr[to];
        arr[to] = arr[from];
        arr[from] = temp;

        return arr;
    }
}
