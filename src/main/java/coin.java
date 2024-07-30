public class coin {
    public static void main(String[] args) {
        System.out.println(coinChange(2567));
    }
    public static int coinChange(int k) {
        // 금액 k
        // 100 <= k <= 100,000
        // 최소한의 동전 갯수
        // 500, 100, 50, 10, 1
        // 현재 값을 저장할 수 있는 current 변수 선언.
        int currentPrice = 0;
        int count = 0;

        // 만약에 K 값이 500원 이상이면,
        while (k >= 500) {
            k = k - 500;
            count ++;
            // k - 500 원을 하고 값을 저장.
            // 500원 이하가 될 때까지. 반복.
            // 빼진 횟수를 카운트를 올려야 함.
        }
        while (k >= 100) {
            k = k - 100;
            count ++;
        }
        while (k >= 50) {
            k = k - 50;
            count ++;
        }
        while (k >= 10 ) {
            k = k - 10;
            count ++;
        }
        while (k > 0 ) {
            k = k - 1;
            count ++;
        }
        return count;


        // 만약 k 값이 500원 이하이면 100 이상이면,
        // k - 100 원을 하고 값을 저장.
        // 100 미만이 될 때까지. 반복.
        // 빼진 횟수 카운트 올리기.

        // 만약 k 값이 100 이하 50 원 이상이면,
        // k - 50 원을 하고 값을 저장.
        // 50원 미만이 될 때까지. 반복
        // 빼진 횟수 카운트 올리기.

        // 만약 k 값이 50원 이하 10 원 이상이면,
        // k -10 원을 하고 값을 저장.
        // 10 원 미만이 될 때까지 반복하고
        // 빼진 횟수 카운트 올리기.

        // 만약 k 값이 0원 이상이면,
        // K - 1 원을 하고 값을 저장.
        // 0원이 될 때까지 반복
        // 빼진 횟수 카운트 올리기.

        // 최종 카운트 수.
    }
}
