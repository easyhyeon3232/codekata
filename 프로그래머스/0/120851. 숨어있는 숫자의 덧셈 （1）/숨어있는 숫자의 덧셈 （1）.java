class Solution {
    public int solution(String my_string) {
        char answer;
        int result=0;
        
        for (int i =0; i<my_string.length(); i++) {
            answer = my_string.charAt(i);
            if (Character.isDigit(answer)) {
                result += (answer - '0');
            }
        }
        return result;
    }
}