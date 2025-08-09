class Solution {
    public long solution(int price, int money, int count) {
        long totalCost = 0;
        for (int i = 1; i <= count; i++) {
            totalCost += (long) price * i;
        }

        long 부족한금액 = totalCost - money;

        if (부족한금액 > 0) {
            return 부족한금액;
        } else {
            return 0;
        }
    }
}