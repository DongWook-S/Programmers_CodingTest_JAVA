package Lv1;

public class CodingTest10 {
    public long solution(long n) {
        long answer = 0;

        int result = (int) Math.sqrt(n);

        answer = Math.pow(result, 2) == n ? (long) Math.pow(result + 1, 2) : -1;

        /* 테스트 채점에서 막혀서 주석처리
        for (int i = 0; i < n; i++) {
            if (i * i == n) {
                answer = (long)i + 1;
            }
        }

        answer = answer == 0 ? -1 : answer * answer;
        */

        return answer;
    }
    public static void main(String[] args) {
        CodingTest10 ct10 = new CodingTest10();

        System.out.println(ct10.solution(121));
    }
}
