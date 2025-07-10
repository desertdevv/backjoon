import java.util.HashMap;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int castTime = bandage[0];
        int healPerSec = bandage[1];
        int bonusHeal = bandage[2];

        int maxHealth = health;
        int currentHealth = health;
        int lastAttackTime = 0;

     
        for (int[] attack : attacks) {
            int attackTime = attack[0];
            int damage = attack[1];

            // 회복시간 
            int healing = attackTime - lastAttackTime - 1;

            // 회복 적용
            if (healing > 0) {
                int totalHeal = healing * healPerSec;
                int bonusCount = healing / castTime;
                totalHeal += bonusCount * bonusHeal;

                currentHealth += totalHeal;
                
                // 최대 체력을 초과하지 않게
                if (currentHealth > maxHealth) {
                    currentHealth = maxHealth;
                }
            }

            // 몬스터 공격으로 인한 피해 적용
            currentHealth -= damage;
            
            // 마지막 공격 시간 업데이트
            lastAttackTime = attackTime;

            // 캐릭터 사망 체크
            if (currentHealth <= 0) {
                return -1;
            }
        }

        // 모든 공격이 끝난 후 남은 체력
        int answer = currentHealth;
        return answer;
    }
}