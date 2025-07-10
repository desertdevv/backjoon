import java.util.HashMap;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int friendCount = friends.length;

        HashMap<String, Integer> friendIndex = new HashMap<>();
        for (int i = 0; i < friendCount; i++) {
            friendIndex.put(friends[i], i);
        }

        // 주고받은 선물 기록 / i가 j에게 준 선물의 수
        int[][] giftRecord = new int[friendCount][friendCount];

        // 선물 지수
        int[] giftScore = new int[friendCount];

        // 선물 기록 처리
        for (String gift : gifts) {
            String[] names = gift.split(" ");
            int giverIndex = friendIndex.get(names[0]);
            int receiverIndex = friendIndex.get(names[1]);

            giftRecord[giverIndex][receiverIndex]++;
        }

        // 선물 지수 계산
        for (int i = 0; i < friendCount; i++) {
            int given = 0;
            int received = 0;
            for (int j = 0; j < friendCount; j++) {
                given += giftRecord[i][j];
                received += giftRecord[j][i];
            }
            giftScore[i] = given - received;
        }

        // 다음 달에 받을 선물 수 계산
        int[] nextMonthGifts = new int[friendCount];
        for (int i = 0; i < friendCount; i++) {
            for (int j = i + 1; j < friendCount; j++) {
                // i와 j가 주고받은 선물 수
                int giftsFromIToJ = giftRecord[i][j];
                int giftsFromJToI = giftRecord[j][i];

                // 더 많은 선물을 준 사람이 받기
                if (giftsFromIToJ > giftsFromJToI) {
                    nextMonthGifts[i]++;
                } else if (giftsFromJToI > giftsFromIToJ) {
                    nextMonthGifts[j]++;
                } else {
                    // 주고받은수같을때 선물지수 비교
                    if (giftScore[i] > giftScore[j]) {
                        nextMonthGifts[i]++;
                    } else if (giftScore[j] > giftScore[i]) {
                        nextMonthGifts[j]++;
                    }
                    
                }
            }
        }

        // 가장 많이 받는 선물의 수 찾기
        for (int giftsReceived : nextMonthGifts) {
            if (giftsReceived > answer) {
                answer = giftsReceived;
            }
        }

        return answer;
    }
}