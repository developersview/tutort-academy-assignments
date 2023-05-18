import java.util.Arrays;

/**
 * @author pranoy.chakraborty
 * @Date 18/05/2023
 */
public class QuestionThreeSolution {
    public static void main(String[] args) {
        System.out.println(isAnagramMethod1("anagram", "nagaram"));
        System.out.println(isAnagramMethod2("anagram", "nagaram"));
    }

    //time complexity -> O(nlogn)
    static boolean isAnagramMethod1(String s, String t) {
        char[] sArray = s.toCharArray();
        Arrays.sort(sArray);
        char[] tArray = t.toCharArray();
        Arrays.sort(tArray);
        return Arrays.equals(sArray, tArray);
    }

    //time complexity -> O(n), space complexity -> O(1)
    static boolean isAnagramMethod2(String s, String t) {
        int[] freq = new int[26];
        for(char c: s.toCharArray()){
            freq[c-'a']++;
        }
        for(char c:t.toCharArray()){
            freq[c-'a']--;
        }
        return Arrays.stream(freq).allMatch(x->x==0);
    }
}
