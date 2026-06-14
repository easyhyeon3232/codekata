import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        String numStr = "";
        
        for (String s : my_string.split("")){
            if(Character.isDigit(s.charAt(0))) {
                numStr += s;
            }
        }
        
        String[] numArr = numStr.split("");
        int[] answer = new int[numArr.length];
        
        for (int i = 0; i < numArr.length; i++) {
            answer[i] = Integer.parseInt(numArr[i]);
        }
        Arrays.sort(answer);
        return answer;
    }
}