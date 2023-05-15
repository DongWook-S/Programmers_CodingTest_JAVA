package Lv1;

public class CodingTest05 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        CodingTest05 cd05 = new CodingTest05();

        System.out.println(cd05.solution(12));
    }
}
