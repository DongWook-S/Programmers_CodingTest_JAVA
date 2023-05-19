package Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CodingTest30 {
    public int[] solution(int []arr) {
        ArrayList<Integer> arrayList = new ArrayList();
        int num = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                num = arr[i];
                arrayList.add(num);
            }
        }
        /*
         * arrayList.stream()은 arrayList를 스트림으로 변환합니다.
         * 스트림은 연속된 데이터 요소의 시퀀스를 나타내는 Java 8의 기능입니다.
         *
         * .mapToInt(Integer::intValue)는 스트림의 각 요소를
         * int 값으로 매핑합니다. 여기서 Integer::intValue는
         * Integer 객체의 intValue() 메서드를 호출하여 해당
         * Integer 값을 int로 변환하는 메서드 참조입니다.
         * 이렇게 매핑된 int 값들은 IntStream으로 표현됩니다.
         *
         * .toArray()는 IntStream의 요소를 배열로 변환합니다. 따라서,
         * 최종적으로 toArray()를 호출하여 IntStream의 요소들을 int 배열로 반환합니다.
         *
         * arrayList.stream().mapToInt(Integer::intValue).toArray()는
         * arrayList의 값을 스트림으로 변환한 후 각 요소를 int 값으로 매핑하고,
         * 그 결과를 int 배열로 반환하는 과정을 나타냅니다.
         * 이를 통해 ArrayList의 값을 반복문 없이도 int 배열로 얻을 수 있습니다.
         */
        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        CodingTest30 ct30 = new CodingTest30();

        int[] array = {1, 1, 3, 3, 0, 1, 1};
        // int[] array = {4, 4, 4, 3, 3};

        System.out.println(Arrays.toString(ct30.solution(array)));
    }
}
