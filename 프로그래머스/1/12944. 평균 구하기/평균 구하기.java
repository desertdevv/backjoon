import java.util.Arrays;

class Solution {
    public double solution(int[] arr) {
        // 1. 반복문 사용
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;

    }
}