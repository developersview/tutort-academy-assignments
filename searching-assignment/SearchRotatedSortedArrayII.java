/**
 * @author pranoy.chakraborty
 * @Date 19/06/2023
 */
public class SearchRotatedSortedArrayII {
    public static void main(String[] args) {
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        System.out.println(search(new int[]{1, 0, 1, 1, 1, 1}, 0));
    }

    static boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high && nums[low] == nums[high]) {
            if (nums[low] == target) {
                return true;
            }
            low++;
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[low] <= nums[mid]) {
                if (target >= nums[low] && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (target <= nums[high] && target >= nums[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }

}
