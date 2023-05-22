package Lv1;

public class CodingTest31 {
    public int solution(int n) {
        int answer = 0;

        int initNum = 0;  // 초기값
        int quotient = 0; // 몫
        int division = 0; // 나머지

        String str = "";

        while(true) {
            quotient = initNum == 0 ? n / 3 : answer / 3;
            division = initNum == 0 ? n % 3 : answer % 3;

            answer = quotient;

            str += division;

            initNum++;

            if (answer == 0) break;
        }

        int initNum2 = 0;
        int result = 0;

        for (int i = str.length(); i > 0; i--) {
            int num = Integer.parseInt(str.substring(i - 1, i));

            result += initNum2 == 0 ? num : (Math.pow(3, initNum2)) * num;

            initNum2++;
        }

        answer = result;

        return answer;
    }
    public static void main(String[] args) {
        CodingTest31 ct31 = new CodingTest31();

        System.out.println(ct31.solution(125));
    }
}
