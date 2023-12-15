package JavaCollection;

import java.util.LinkedList;
import java.util.Queue;

// Queue 인터페이스는 FIFO(First-In-First-Out) 순서로 요소를 처리합니다.
public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("first");
        queue.add("second");
        queue.add("third");

        while (!queue.isEmpty()) {
            System.out.println("queue.poll() = " + queue.poll()); // 요소를 하나씩 꺼내면서 출력
        }
    }
}
