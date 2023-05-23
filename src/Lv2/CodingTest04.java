package Lv2;

import java.util.LinkedList;

public class CodingTest04 {
    //String[] strArray = s.split("");

    //for (int i = strArray.length - 1; i < strArray.length; i++) {
    //  answer = strArray[i].equals("(") ? false : true;
    //}

    //return s.substring(s.length() - 1, s.length()).equals("(") ? false : true;
    boolean solution(String s) {
        LinkedList<Character> linkedList = new LinkedList<>();

        /*
         * linkedList.isEmpty()  : linkedList 가 비어있으면 true 그렇지 않으면 false
         * linkedList.pollLast() : linkedList 의 마지막 요소를 반환하면서 제거
         */

        for (char ch : s.toCharArray()) {
            if (ch == '(') linkedList.add(ch);
            else {
                if (linkedList.isEmpty()) return false;
                linkedList.pollLast();
            }
        }

        return linkedList.isEmpty();
    }
    public static void main(String[] args) {
        CodingTest04 ct04 = new CodingTest04();

        System.out.println(ct04.solution(")"));
    }
}
