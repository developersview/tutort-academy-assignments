/**
 * @author pranoy.chakraborty
 * @Date 19/06/2023
 */
public class FindMinimumInRotatedSortedArrayII {
    public static void main(String[] args) {
        System.out.println(search(new int[]{1, 3, 3, 3}));
        System.out.println(search(new int[]{2, 2, 2, 0, 1}));
    }

    static int search(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < nums[high]) {
                high = mid;
            } else if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high--;
            }
        }
        return nums[low];
    }
}
