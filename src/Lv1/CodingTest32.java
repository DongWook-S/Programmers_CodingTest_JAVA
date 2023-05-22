package Lv1;

public class CodingTest32 {
    public String solution(String s) {
        String answer = "";
        String[] strArray = s.split(" ", -1);

        for (int i = 0; i < strArray.length; i++) {
            String initStr = "";

            for (int j = 0; j < strArray[i].length(); j++) {
                String str = strArray[i].substring(j, j + 1);
                initStr += j % 2 == 0 ? str.toUpperCase() : str.toLowerCase();
            }
            strArray[i] = initStr;
        }

        for (int i = 0; i < strArray.length; i++) {
            answer += i != strArray.length - 1 ? strArray[i] + " " : strArray[i];
        }

        return answer;
    }
    public static void main(String[] args) {
        CodingTest32 ct32 = new CodingTest32();

        System.out.println(ct32.solution("try hello world"));
    }
}
