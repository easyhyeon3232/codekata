class Solution {
    public int solution(double num1, double num2) {
        int answer = 0;
        if(0 < num1 && num1 <= 100 && 0 < num2 && num2 <= 100) {
            answer =  (int)(num1 / num2 * 1000);
        }
        return answer;
    }
}