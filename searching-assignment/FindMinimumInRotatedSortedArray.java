/**
 * @author pranoy.chakraborty
 * @Date 19/06/2023
 */
public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println(search(new int[]{3, 4, 5, 1, 2}));
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}));
    }

    static int search(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < nums[high]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return nums[low];
    }
}
