/**
 * @author pranoy.chakraborty
 * @Date 19/06/2023
 */
public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        System.out.println(peakIndexInMountainArray(new int[]{0,1,0}));
        System.out.println(peakIndexInMountainArray(new int[]{0,10,5,2}));
        System.out.println(peakIndexInMountainArray(new int[]{0,2,1,0}));
    }

    static int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
