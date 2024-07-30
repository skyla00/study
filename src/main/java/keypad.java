import java.util.*;

public class keypad {
    public static void main(String[] args) {
        class Solution {
            //테이블 만들기
            private final Map<Character, int[]> keyIndex = new HashMap<>();
            {   keyIndex.put('1', new int[]{1, 2, 3, 4});
                keyIndex.put('2', new int[]{0, 1, 2, 3});
                keyIndex.put('3', new int[]{1, 2, 3, 4});
                keyIndex.put('4', new int[]{2, 1, 2, 3});
                keyIndex.put('5', new int[]{1, 0, 1, 2});
                keyIndex.put('6', new int[]{2, 1, 2, 3});
                keyIndex.put('7', new int[]{3, 2, 1, 2});
                keyIndex.put('8', new int[]{2, 1, 0, 1});
                keyIndex.put('9', new int[]{3, 2, 1, 2});
                keyIndex.put('0', new int[]{3, 2, 1, 0});
                keyIndex.put('*', new int[]{4, 3, 2, 1});
                keyIndex.put('#', new int[]{4, 3, 2, 1});
            }

            public String solution(int[] numbers, String hand) {
                // 정답을 저장할 문자열 선언, 초기값은 빈 문자열
                String answer = "";

                // 왼쪽, 오른쪽 손가락의 위치를 기억할 변수 선언, 초기값 할당.
                char leftHand = '*';
                char rightHand = '#';
                // numbers 순회
                for (int number : numbers ) {
                    // 요소가 1, 4, 7 인 경우
                    char currentKey = Character.forDigit(number,10);
                    if(currentKey == '1' || currentKey == '4' || currentKey == '7') {
                        // answer 에 L을 추가
                        answer += 'L';
                        // 좌측 손가락의 위치를 1,4,7로 변경 (현재 이동한 위치로)
                        leftHand = currentKey;
                        // 요소가 3, 6, 9 인 경우
                    } else if (currentKey == '3' || currentKey == '6' || currentKey == '9') {
                        // answer 에 R을 추가
                        answer += 'R';
                        // 우측 손가락의 위치를 3, 6, 9 로 변경 (현재 이동한 위치로)
                        rightHand = currentKey;
                    } else {
                        // 현재 좌측 손가락과 우측 손가락의 위치에서 이동해야할 곳 까지의 거리를 계산해서 비교
                        int leftDistance = getDistance(leftHand, currentKey);
                        int rightDistance = getDistance(rightHand, currentKey);
                        // 좌측 손가락이 거리가 더 짧다면
                        if (leftDistance < rightDistance || (leftDistance == rightDistance && hand.equals("left"))) {
                            // answer += "L";
                            // 좌측 손가락의 위치를 현재 이동한 곳으로 변경.
                            answer += "L";
                            leftHand = currentKey;
                        } else {
                            answer += "R";
                            rightHand = currentKey;
                        }
                    }
                }

                return answer;
            }

            public int getDistance (char from, char to) {
                int[] fromDistanceArr = keyIndex.get(from);
                switch (to) {
                    case '2' :
                        return fromDistanceArr[0];
                    case '5' :
                        return fromDistanceArr[1];
                    case '8' :
                        return fromDistanceArr[2];
                    case '0' :
                        return fromDistanceArr[3];
                    default :
                        return -1 ;
                }
            }
        }
    }
}
