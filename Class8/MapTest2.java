package Class8;

import java.util.HashMap;
import java.util.Map;

public class MapTest2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("lastname", "asasd");
        map.put("firstname", "adlahsf");

        Map<String,Map> map2= new HashMap<>();
        map2.put("author",map);
        System.out.println(map2);
    }
}
