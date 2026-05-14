class Solution {
    public int solution(int[] sides) {
        int sum = 0;
        int max = sides[0];


        for (int i = 0; i<sides.length; i++) {
            sum += sides[i];
            
            if(sides[i] > max) {
                max = sides[i];
            }
        }
        return (max < sum - max) ? 1 : 2;
    }       
}