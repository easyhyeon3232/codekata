class Solution {
    public int solution(String str1, String str2) {
    
        boolean result = str1.contains(str2);
        
        if(result == true) {
            return 1;
        }else {
            return 2;
        }
    }
}