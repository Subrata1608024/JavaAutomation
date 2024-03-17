package Class8;

import java.util.HashMap;
import java.util.Map;

public class mapTest {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("name","john");
        map.put("age",30);
        map.put("age",31);
        map.put("car",null);
        System.out.println(map.get("age"));
        map.put("Time", 10);
        map.remove("car");
        Map<String, Map> map2 = new HashMap<>();

    }
}
