package Lv1;

public class CodingTest01 {
    public int solution(int n) {
        int answer = 0;

        String str = Integer.toString(n);

        for (int i = 0; i < str.length(); i++) {
            answer += Integer.parseInt(str.substring(i, i + 1));
        }

        System.out.println(answer);

        return answer;
    }
    public static void main(String[] args) {
        CodingTest01 ct01 = new CodingTest01();

        ct01.solution(123);
    }
}
