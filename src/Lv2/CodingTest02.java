package Lv2;

public class CodingTest02 {
    public String solution(String s) {
        String answer = "";
        String[] strArray = s.split(" ", -1);

        for(int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray[i].length(); j++) {
                if (j == 0) answer += strArray[i].substring(j, j + 1).toUpperCase();
                else answer += strArray[i].substring(j, j + 1).toLowerCase();
            }

            answer = i != strArray.length - 1 ? answer + " " : answer;
        }

        return answer;
    }
    public static void main(String[] args) {
        CodingTest02 ct02 = new CodingTest02();

        // System.out.println(ct02.solution("3people unFollowed me"));
        System.out.println(ct02.solution("for the last week"));
    }
}
