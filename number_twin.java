import java.util.Arrays;

class Solution {
    public String solution(String X, String Y) {
        
        char[] charX = X.toCharArray();
        char[] charY = Y.toCharArray();
        Arrays.sort(charX);
        Arrays.sort(charY);
        
        // 숫자 비교 후 일치할 경우 idx 감소
        StringBuilder answer = new StringBuilder();
        int idxX = charX.length -1;
        int idxY = charY.length -1;
        
        while(idxX >= 0 && idxY >= 0){
            // 두수가 짝꿍을 이룰 경우
            if(charX[idxX] == charY[idxY]){
                answer.append(charX[idxX]);
                idxX--;
                idxY--;
            }
            else if (charX[idxX] > charY[idxY]) {
                idxX--;
            } else {
                idxY--;
            }
        }
        
        // 공통으로 나타나는 정수가 없을 경우
        if (answer.length() == 0) {
            return "-1";
        }

        // 정수 k가 0으로만 구성되어 있을 경우
        if (answer.toString().matches("0+")) {
            return "0";
        }
        
        return answer.toString();
    }
}
// 문자열에서 문자 하나씩 분리하는 방법
/*
1. split 이용
2. List, map 등을 이용
3. 배열로 변환, toCharArray 함수, StringBuilder 함수?

*/