package Lv1;

public class CodingTest13 {
    public long solution(int a, int b) {
        long answer = 0;

        int num01 = a < b ? a : b;
        int num02 = a > b ? a : b;

        for (int i = num01; i <= num02; i++) {
            answer += i;
        }

        return answer;
    }
    public static void main(String[] args) {
        CodingTest13 ct13 = new CodingTest13();

        System.out.println(ct13.solution(3, 5));
    }
}
