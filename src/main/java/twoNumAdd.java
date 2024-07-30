import java.util.ArrayList;
import java.util.Arrays;

public class twoNumAdd {
    public static void main(String[] args) {

    }
    public static int[] twoNumAdd(int[] num) {
        // 결과값을 담을 배열 선언.
        ArrayList<Integer> result = new ArrayList<>();
        // num 을 sort 를 해 주어야 함.
        Arrays.sort(num);

        // 순회를 하면서 값을 더함.
        // i < 0 부터, num.length 만큼  num 배열의 요소를 돌면서
        for (int i = 0; i < num.length ; i ++) {
            // i + 1  부터 num.length 만큼의 num 배열의 요소를 더함.
            for (int j = i + 1 ; j <num.length; j ++) {
                // 더한 값을 배열에 저장.
                // 이때 배열에 저장한 값이랑 비교를 해야함.
                Integer currentNum = num[i] + num[j];

                if(!result.contains(currentNum)) {
                    // contains 를 쓸 수 있나? 포함하고 있는지?
                    result.add(currentNum);
                }
            }
        }

        return result.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
