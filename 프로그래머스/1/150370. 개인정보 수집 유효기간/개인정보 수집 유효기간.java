import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        // 파기할 개인정보 번호를 저장할 리스트
        List<Integer> expiredList = new ArrayList<>();
        
        // 약관 종류와 유효기간을 쉽게 찾기 위해 Map 자료구조 사용
        Map<String, Integer> termsMap = new HashMap<>();
        for (String term : terms) {
            String[] parts = term.split(" ");
            termsMap.put(parts[0], Integer.parseInt(parts[1]));
        }

        // 오늘 날짜를 일(day) 단위로 변환
        int todayInDays = dateToDays(today);

        // 각 개인정보를 순회하며 파기 여부 확인
        for (int i = 0; i < privacies.length; i++) {
            String[] privacyParts = privacies[i].split(" ");
            String collectionDate = privacyParts[0];
            String termType = privacyParts[1];

            // 개인정보 수집일자를 일(day) 단위로 변환
            int collectionDateInDays = dateToDays(collectionDate);
            
            // 해당 약관의 유효기간(달)을 가져옴
            int validityMonths = termsMap.get(termType);
            
            // 만료일 계산 (수집일 + 유효기간). 모든 달은 28일로 계산.
            // 유효기간이 지났다는 것은 오늘 날짜가 만료일보다 크거나 같다는 의미
            if (todayInDays >= collectionDateInDays + (validityMonths * 28)) {
                // 파기해야 할 개인정보의 번호(i + 1)를 리스트에 추가
                expiredList.add(i + 1);
            }
        }
        
        // 결과를 담을 배열을 생성하고 리스트의 값을 복사
        int[] answer = new int[expiredList.size()];
        for (int i = 0; i < expiredList.size(); i++) {
            answer[i] = expiredList.get(i);
        }
        
        return answer;
    }

    private int dateToDays(String dateStr) {
        String[] dateParts = dateStr.split("\\.");
        int year = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int day = Integer.parseInt(dateParts[2]);
        
        // 연, 월, 일을 모두 일(day)로 환산하여 더함
        return (year * 12 * 28) + ((month - 1) * 28) + day;
    }
}