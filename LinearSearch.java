public class LinearSearch {
    public static void main(String[] args) {
        int nums[] = { 1, 3, 6, 8, 10 };
        int target = 11;

        int result = linearSearch(nums, target);
        if (result > 0) {
            System.out.println("Found target value at index " + result);
        } else {
            System.out.println("Can not found target value");
        }
    }

    public static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}