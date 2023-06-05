import java.util.ArrayList;
import java.util.List;

/**
 * @author pranoy.chakraborty
 * @Date 05/06/2023
 */
public class FindCommonCharacters {
    public static void main(String[] args) {
        System.out.println(commonStrings(new String[]{"bella", "label", "roller"}));
    }

    public static List<String> commonStrings(String[] words) {
        List<String> res = new ArrayList<>();
        String temp = words[0];
        for (int i = 1; i < words.length; i++) {
            temp = getCommonString(temp, words[i]);
            if (temp.length() == 0) return res;
        }
        char[] arr = temp.toCharArray();
        for (char c : arr) {
            res.add(String.valueOf(c));
        }
        return res;
    }

    public static String getCommonString(String a, String b) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for (char c : a.toCharArray()) {
            arr1[c - 'a']++;
        }
        for (char c : b.toCharArray()) {
            arr2[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != 0 && arr2[i] != 0) {
                for (int j = 0; j < Math.min(arr1[i], arr2[i]); j++) {
                    sb.append((char) (i + 'a'));
                }
            }
        }
        return sb.toString();
    }
}
