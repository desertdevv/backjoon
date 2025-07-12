import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        Map<String, Integer> dataIndex = new HashMap<>();
        dataIndex.put("code", 0);
        dataIndex.put("date", 1);
        dataIndex.put("maximum", 2);
        dataIndex.put("remain", 3);

        int extIndex = dataIndex.get(ext);
        int sortByIndex = dataIndex.get(sort_by);

        // 조건대로 분류
        List<int[]> filteredList = new ArrayList<>();
        
        // 조건에 맞는 것들만 리스트에 추가 
        for (int[] row : data) {
            if (row[extIndex] < val_ext) {
                filteredList.add(row);
            }
        }
        
        // 오름차순 정렬
        filteredList.sort(Comparator.comparingInt(row -> row[sortByIndex]));
        
        // 리스트크기에 맞게 answer의 크기지정
        int[][] answer = new int[filteredList.size()][4];

        for (int i = 0; i < filteredList.size(); i++) {
            answer[i] = filteredList.get(i);
        }

        return answer;
    }
}