package Lv2;

public class CodingTest01 {
    public String solution(String s) {
        String answer = "";
        String[] strArray = s.split(" ");

        for (int i = 0; i < strArray.length; i++) {
            for (int j = i + 1; j < strArray.length; j++) {
                if (Integer.parseInt(strArray[i]) > Integer.parseInt(strArray[j])) {
                    String temp = strArray[i];
                    strArray[i] = strArray[j];
                    strArray[j] = temp;
                }
            }
        }

        String Min = strArray[0];
        String Max = strArray[strArray.length - 1];

        answer = Min + " " + Max;

        return answer;
    }
    public static void main(String[] args) {
        CodingTest01 ct01 = new CodingTest01();

        System.out.println(ct01.solution("1 2 3 4"));
    }
}
