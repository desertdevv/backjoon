import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // id_list의 순서에 맞춰 결과를 저장할 배열
        int[] answer = new int[id_list.length];
        
        // 유저 ID 저장 맵
        Map<String, Integer> idToIndex = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            idToIndex.put(id_list[i], i);
        }
        
        // 중복 신고를 제거하고, 각 유저가 신고한 유저 목록을 저장
        // key: 신고한 유저 ID, value: 신고당한 유저 ID들의 Set
        Map<String, Set<String>> reporterList = new HashMap<>();
        for (String id : id_list) {
            reporterList.put(id, new HashSet<>());
        }
        
        for (String r : report) {
            String[] parts = r.split(" ");
            String reporter = parts[0];
            String reported = parts[1];
            
            reporterList.get(reporter).add(reported);
        }
        
        // 각 유저가 신고당한 횟수를 저장
        // key: 신고당한 유저 ID, value: 신고당한 횟수
        Map<String, Integer> reportedCounts = new HashMap<>();
        for (String id : id_list) {
            reportedCounts.put(id, 0);
        }
        
        for (String reporter : reporterList.keySet()) {
            for (String reported : reporterList.get(reporter)) {
                reportedCounts.put(reported, reportedCounts.getOrDefault(reported, 0) + 1);
            }
        }
        
        // 정지된 유저들을 찾아 저장
        Set<String> suspendedUsers = new HashSet<>();
        for (String user : id_list) {
            if (reportedCounts.get(user) >= k) {
                suspendedUsers.add(user);
            }
        }
        
        // 각 유저가 받은 결과 메일 수를 계산
        for (String reporter : id_list) {
            int mailCount = 0;
            for (String reported : reporterList.get(reporter)) {
                if (suspendedUsers.contains(reported)) {
                    mailCount++;
                }
            }
            answer[idToIndex.get(reporter)] = mailCount;
        }
        
        return answer;
    }
}