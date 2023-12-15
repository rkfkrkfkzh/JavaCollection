package JavaCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> countries = new HashSet<>();
        countries.add("USA");
        countries.add("Korea");
        countries.add("China");
        countries.add("Korea"); // set은 중복을 허용하지 않음

        for (String country : countries) {
            System.out.println(country);
        }

        // LinkedHashSet은 HashSet의 모든 기능을 포함하면서도, 요소들이 삽입된 순서를 유지하는 컬렉션
        //  내부적으로 LinkedHashSet은 해시 테이블과 연결 리스트를 결합하여 구현되어 있으며, 이는 요소의 해시코드를 사용하여 빠른 검색을 가능
        Set<String> orderedSet = new LinkedHashSet<>();
        orderedSet.add("Apple");
        orderedSet.add("Banana");
        orderedSet.add("Cherry");

        // 삽입된 순서대로 출력
        orderedSet.forEach(System.out::println);
    }
}
    // HashSet 내부적으로 HashMap을 사용, 요소의 순사가 중요하지 않고, 중복허용하지 않으면서, 대규모 데이터에 빠른 검색이 필요할 떄
    // LinkedHashSet은 LinkedList와 유사한 구조를 내부적으로 사용, 요소의 삽입 순서 유지, 중복허용하지 않으면서, 순서가 중요한 데이터셋에서 사용 HashSet에 비해 메모리 조금 더 사용
    // Set 인터페이스는 중복을 허용하지 않으며, 순서를 보장하지 않습니다.
