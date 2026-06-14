import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        
        return Arrays.stream(my_string.split(""))
            .filter(s -> Character.isDigit(s.charAt(0)))
            .mapToInt(Integer :: parseInt)
            .sorted()
            .toArray();
    }
}