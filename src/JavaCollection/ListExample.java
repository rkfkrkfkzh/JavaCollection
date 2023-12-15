package JavaCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// List 인터페이스는 요소를 순서대로 저장합니다. 중복 요소를 허용합니다.
public class ListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Banana"); // List는 중복을 허용

        fruits.forEach(System.out::println);

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        // 각 요소에 대한 순차 접근
        linkedList.forEach(System.out::println);
    }
}
/*
ArrayList는 내부적으로 동적 배열(dynamic array)을 사용하여 요소를 관리(크기가 고정되어 있지 않고 필요에 따라 자동으로 크기가 조절), 랜덤 엑세스(O(1)),
LinkedList는 양방향 연결 리스트(doubly linked list)를 사용하여 요소를 관리, 랜덤엑세스 (O(n)),
요소의 빈번한 접근이 필요할 때 사용합니다. 예를 들어, 리스트를 순회하거나 특정 인덱스에서 요소를 조회할 때 유리 (ArrayList)
요소의 추가 및 삭제가 리스트의 시작, 중간, 끝에서 빈번히 발생할 때 사용 (Linkedlist)
 */
