//+ The array must be sorted for binary search
//+ Time complexity -> O(log n)
//+ Every time when you double the array size, the steps will only increase by 1

public class BinarySearch {
    public static void main(String[] args) {
        int nums[] = { 1, 3, 6, 8, 10 };
        int target = 10;

        // int result = binarySearch(nums, target);
        int result = binarySearchRecursion(nums, target, 0, nums.length - 1);
        if (result > 0) {
            System.out.println("Found target value at index " + result);
        } else {
            System.out.println("Can not found target value");
        }
    }

    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearchRecursion(int[] nums, int target, int left, int right) {
        if (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                // left = mid + 1;
                return binarySearchRecursion(nums, target, mid + 1, right);
            } else {
                // right = mid - 1;
                return binarySearchRecursion(nums, target, left, mid - 1);
            }
        }
        return -1;
    }
}
