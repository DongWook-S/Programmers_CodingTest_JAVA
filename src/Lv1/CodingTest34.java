package Lv1;

public class CodingTest34 {
    public String solution(String s, int n) {
        String answer = "";
        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            int num = s.charAt(i) == ' ' ? 32 : Character.valueOf(s.charAt(i)) + n;

//            switch (s.charAt(i)) {
//                case ' ' : num = 32; break;
//                case 'Z' : num = 63 + n; break;
//                case 'z' : num = 96 + n; break;
//                default : num = Character.valueOf(s.charAt(i)) + n; break;
//            }

            answer += (char) result;
        }

        return answer;
    }
    public static void main(String[] args) {
        CodingTest34 ct34 = new CodingTest34();

        System.out.println(ct34.solution("a B z", 4));
    }
}
