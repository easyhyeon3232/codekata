class Solution {
    public int solution(int num, int k) {
        String numStr = String.valueOf(num);
        int index = numStr.indexOf(String.valueOf(k));
        
        return index != -1 ? index + 1 : -1;
    }
}
