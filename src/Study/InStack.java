package Study;
/*
 * 스택(stack)
 * 데이터를 일시적으로 쌓아 놓는 자료구조
 * 데이터의 입력과 출력 순서는 후입선출(LIFO : Last In First Out)
 * 가장 나중에 넣은 데이터를 가장 먼저 꺼냄
 * 스택에서 데이터를 넣는 작업 -> push / 데이터를 꺼내는 작업 -> pop
 */
public class InStack {

    private int[] stk;      // 스택용 배열
    private int capacity;   // 스택 용량
    private int ptr;        // 스택 포인터

    // 실행 시 예외 : 스택이 비어 있음
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() { }
    }

    // 실행 시 예외 : 스택이 가득참
    public class OverflowInStackException extends RuntimeException {
        public OverflowInStackException() { }
    }

    // 생성자
    public InStack(int maxlen) {
        ptr = 0;
        capacity = maxlen;

        try {
            stk = new int[capacity];        // 스택 본체용 배열을 생성
        } catch (OutOfMemoryError e) {      // 생성할 수 없음
            capacity = 0;
        }
    }

    // 스택에 x를 Push
    public int push(int x) throws OverflowInStackException {
        if (ptr >= capacity) {
            throw new OverflowInStackException();
        }

        return stk[ptr++] = x;
    }

    // 스택에서 데이터를 Pop (꼭대기에 있는 데이터를 꺼냄)
    public int pop() throws EmptyIntStackException {
        if (ptr <= 0) {
            throw new EmptyIntStackException();
        }

        return stk[--ptr];
    }

    // 스택에서 데이터를 피크(꼭대기에 있는 데이터를 들여다봄)
    public int peek() throws EmptyIntStackException {
        if (ptr <= 0) {
            throw new EmptyIntStackException();
        }

        return stk[ptr - 1];
    }

    // 스택을 비움
    public void clear() {
        ptr = 0;
    }

    // 스택에서 x를 찾아 인덱스(없으면 -1)를 반환
    public int indexOf(int x) {
        for (int i = ptr - 1; i >= 0; i--) {    // 꼭대기 쪽부터 선형 검색
            if (stk[i] == x) {
                return i;   // 검색 성공
            }
        }

        return -1;  // 검색실패
    }

    // 스택의 용량을 반환
    public int getCapacity() {
        return capacity;
    }

    // 스택에 쌓여 있는 데이터 개수를 반환
    public int size() {
        return ptr;
    }

    // 스택이 비어 있는가?
    public boolean isEmpty() {
        return ptr <= 0;
    }

    // 스택이 가득 찼는가?
    public boolean isFull() {
        return ptr >= capacity;
    }

    // 스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
    public void dump() {
        if (ptr <= 0) {
            System.out.println("스택이 비어 있습니다.");
        }
        else {
            for (int i = 0; i < ptr; i++) {
                System.out.print(stk[i] + " ");
            }
            System.out.println();
        }
    }
}
