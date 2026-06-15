class Solution {
    public int solution(int[] numbers) {
        int result = Integer.MIN_VALUE;
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                result = Math.max(result, numbers[i] * numbers[j]);
            }
        }
        return result;
    }
}