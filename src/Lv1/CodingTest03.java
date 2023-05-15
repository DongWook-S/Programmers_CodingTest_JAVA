package Lv1;

public class CodingTest03 {
    public double solution(int[] arr) {
        double answer = 0;

        for (int i = 0; i < arr.length; i++) {
            Integer val = arr[i];
            answer += val;
        }

        answer = answer / arr.length;

        return answer;
    }
    public static void main(String[] args) {
        int[] initArr = {1, 2, 3, 4};

        CodingTest03 ct03 = new CodingTest03();

        System.out.println(ct03.solution(initArr));
    }
}
