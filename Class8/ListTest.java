package Class8;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        marks.add(80);//80
        marks.add(85);//85
        marks.add(70);//70
        marks.add(80);//80
        marks.add(60);//60


        System.out.println(marks.get(0));//80
        marks.remove(0);//85,70,80,60
        marks.add(0,99);//99,85,70,80,60
        marks.add(75);//99,85,70,80,60,75

        System.out.println("===========================================");

        for (Integer integer: marks){
            System.out.println(integer);
        }

        List<Integer> list= Arrays.asList(95,87,86);
        marks.addAll(3, list);

        System.out.println("===========================================");


        marks.removeAll(list);

        System.out.println("===========================================");

        for (Integer integer: marks){
            System.out.println(integer);
        }
        Set<Integer> marks2=new HashSet<>();
        marks2.add(80);//80
        marks2.add(85);//85
        marks2.add(80);//70
        marks2.add(70);//80
        marks2.add(60);//60
        marks.addAll(marks2);
        


        List<Object> objects=new ArrayList<>();
        objects.add(15);
        objects.add(98.5);
        objects.add("dddddd");
    }
}
