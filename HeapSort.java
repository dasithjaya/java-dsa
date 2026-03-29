import java.util.Arrays;

//+ Time complexity 
//+         Build heap -> O(n)
//+         sorting -> O(n log n)
//+         Total -> O(n log n)

public class HeapSort {
    public static void main(String[] args) {
        int nums[] = { 11, 5, 7, 2, 23, 10, 8, 1 };
        heapSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void heapSort(int arr[]) {
        int n = arr.length;

        // Step 1: Build heap (rearrange array)
        // We start from the last non-leaf node: (n/2 - 1)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Step 2: One by one extract elements from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end (swap arr[0] and arr[i])
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    private static void heapify(int arr[], int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest])
            largest = left;

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest])
            largest = right;

        // If largest is not root
        if (largest != i) {
            swap(arr, i, largest);

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    private static void swap(int[] arr, int from, int to) {
        int temp = arr[to];
        arr[to] = arr[from];
        arr[from] = temp;
    }
}
