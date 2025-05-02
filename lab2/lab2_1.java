import java.util.HashSet;

public class lab2_1 {
    public static String findLongestUniqueSubstring(String s) {
        int start = 0;
        int maxLength = 0;
        int maxStart = 0;

        HashSet<Character> seen = new HashSet<>();

        for (int end = 0; end < s.length(); end++) {
            char current = s.charAt(end);

            while (seen.contains(current)) {
                seen.remove(s.charAt(start));
                start++;
            }

            seen.add(current);

            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                maxStart = start;
            }
        }

        return s.substring(maxStart, maxStart + maxLength);
    }
    
    public static void main() {
        String input = "abcabcbb";
        String result = findLongestUniqueSubstring(input);
        System.out.println("Наибольшая подстрока без повторяющихся символов: " + result);
    }
}
