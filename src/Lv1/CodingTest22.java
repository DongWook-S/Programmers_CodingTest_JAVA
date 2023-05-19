package Lv1;

public class CodingTest22 {
    public String solution(int n) {
        String answer = "";

        for (int i = 1; i <= n; i++) {
            answer += i % 2 == 1 ? "수" : "박";
        }

        return answer;
    }
    public static void main(String[] args) {
        CodingTest22 ct22 = new CodingTest22();

        System.out.println(ct22.solution(10));
    }
}
