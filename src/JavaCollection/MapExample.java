package JavaCollection;

import java.util.HashMap;
import java.util.Map;

// Map 인터페이스는 키-값 쌍을 저장합니다. 각 키는 유일해야 합니다.
public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String> userMap = new HashMap<>();
        userMap.put(1, "Kim");
        userMap.put(2, "Lim");
        userMap.put(3, "Lee");
        userMap.put(2, "Jo"); // Key가 같을 경우, 이전 값 대체

        for (Map.Entry<Integer, String> entriy :userMap.entrySet()) {
            System.out.println("Key: "+entriy.getKey()+", Value: "+entriy.getValue());
        }
    }
}
