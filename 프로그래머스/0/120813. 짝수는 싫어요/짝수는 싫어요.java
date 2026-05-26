import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 1) {
                list.add(i);
            }
        }
        int[] index = new int[list.size()];
        for(int i = 0; i<list.size(); i++) {
            index[i] = list.get(i);
        }
        return index;
    }
}