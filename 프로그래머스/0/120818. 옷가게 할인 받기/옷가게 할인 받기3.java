import java.math.BigDecimal;

class Solution {
    public int solution(int price) {

        BigDecimal p = new BigDecimal(price);
        
        if (price >= 500000) {
            return p.multiply(new BigDecimal("0.8")).intValue();
        } else if (price >= 300000) {
            return p.multiply(new BigDecimal("0.9")).intValue();
        } else if (price >= 100000) {
            return p.multiply(new BigDecimal("0.95")).intValue();
        } else {
            return price;
        }
    }
}
