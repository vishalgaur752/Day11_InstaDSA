public class CeilTheFloor {
    public static int ceil(int nums[], int key) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (key == nums[mid]) {
                return mid;
            } else if (key < nums[mid]) {
                end = mid - 1;
            } else {
                end = mid - 1;
            }
        }
        if (start < nums.length) {   
            return nums[start];
        } else {
            return -1;
        }
    }

    public static int floor(int nums[], int key) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == key) {
                return nums[mid];
            } else if (key < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (end >= 0) {
            return nums[end];
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int nums[] = { 19, 23, 56, 61, 72, 88, 92 };
        int key = 68;
        System.out.println(ceil(nums, key));
        System.out.println(floor(nums, key));
    }
}
