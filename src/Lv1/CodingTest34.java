package Lv1;

public class CodingTest34 {
    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i);

            if (num == 32) {
                answer += " ";
                continue;
            }

            if (num <= 90) {
                num += n;
                if (num > 90) num -= 26;
            } else {
                num += n;
                if (num > 122) num -= 26;
            }

            answer += (char) num;
        }

        return answer;
    }
    public static void main(String[] args) {
        CodingTest34 ct34 = new CodingTest34();

        System.out.println(ct34.solution("a B z", 4));
    }
}
