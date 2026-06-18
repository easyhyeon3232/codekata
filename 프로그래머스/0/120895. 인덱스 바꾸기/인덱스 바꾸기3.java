import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        List<String> list = Arrays.asList(my_string.split(""));
        
        Collections.swap(list, num1, num2);
        
        return String.join("", list);
    }
}
