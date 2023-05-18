package Lv1;

public class CodingTest17 {
    public String solution(String phone_number) {
        String answer = "";
        String[] strArray = phone_number.split("");

        for (int i = 0; i < strArray.length; i++) {
            if (i == phone_number.length() - 4) break;
            strArray[i] = "*";
        }

        for (String s : strArray) {
            answer += s;
        }

        return answer;
        // return phone_number.replaceAll(".(?=.{4})", "*");
    }
    public static void main(String[] args) {
        CodingTest17 ct17 = new CodingTest17();

        System.out.println(ct17.solution("01033334444"));
    }
}
