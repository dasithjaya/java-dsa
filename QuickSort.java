import java.util.Arrays;

//+ Time complexity 
//+         Best -> O(n log n)
//+         Worst -> O(n^2)

public class QuickSort {
    public static void main(String[] args) {
        int nums[] = { 11, 5, 7, 2, 23, 10, 8, 1 };
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));

    }

    public static void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int piv = partition(nums, low, high);

            quickSort(nums, low, piv - 1);
            quickSort(nums, piv + 1, high);
        }
    }

    private static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int smallerIndex = low;

        for (int j = low; j < high; j++) {
            if (nums[j] < pivot) {
                swap(nums, smallerIndex, j);
                smallerIndex++;
            }
        }
        swap(nums, smallerIndex, high);
        return smallerIndex;
    }

    public static void swap(int[] arr, int from, int to) {
        if (from != to) {
            int temp = arr[to];
            arr[to] = arr[from];
            arr[from] = temp;
        }
    }
}
