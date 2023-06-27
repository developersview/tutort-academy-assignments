import java.util.HashMap;
import java.util.Map;

/**
 * @author pranoy.chakraborty
 * @Date 08/06/2023
 */
public class DegreeOfArray {
    public static void main(String[] args) {
        System.out.println(findShortestSubArray(new int[]{1, 2, 2, 3, 1}));
    }

    static int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int degree = Integer.MIN_VALUE;
        //simply entering nums in hashmap, keys are numbers, values are frequency/ degree of each element
        //Find the max degree
        for (int num : nums) {
            //freq.put(num, freq.getOrDefault(num, 0) + 1);
            if(freq.containsKey(num)){
                freq.put(num, freq.get(num)+1);
            }else{
                freq.put(num,1);
            }
            degree = Math.max(degree, freq.get(num));
        }
        //clearing the hashmap, to utilize the same map, no extra space, hence SC -> O(n)
        freq.clear();
        //declaring two pointers
        int start = 0, end = 0;
        // declaring current degree and minimum length of the subarray
        int currDegree = Integer.MIN_VALUE, minLength = Integer.MAX_VALUE;
        //sliding window
        while (end < nums.length) {
            freq.put(nums[end], freq.getOrDefault(nums[end], 0) + 1);
            currDegree = Math.max(currDegree, freq.get(nums[end]));
            //if currentdegree == degree, then find length of the possible shortest subarray which is minimumlength
            //increase the start pointer value by 1 and remove the element at start index. in Map decrease the value of the number by 1
            while (currDegree == degree) {
                minLength = Math.min(minLength, end - start + 1);
                freq.put(nums[start], freq.get(nums[start]) - 1);
                if (currDegree == freq.get(nums[start]) + 1) {
                    currDegree--;
                }
                start++;
            }
            end++;
        }
        return minLength;
    }
}
