// 1~k 오름차순 정렬 후 k부터 m개 선택 
import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        for(int i = score.length - m; i >= 0; i-=m){
            answer += score[i] * m;
        }


        return answer;
    }
}
