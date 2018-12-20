package Zadania_17;

import java.util.*;

public class App {

    public static void main(String[] args) {

        //Zadanie1
        List<String> list = new ArrayList<>();

        list.add("Bartek");
        list.add("Bartek");
        list.add("Krzysiek");
        list.add("Alek");
        list.add("Arek");
        list.add("Adrian");
        list.add("Patrycja");
        list.add("Natalia");

        list.remove("Bartek");
        list.remove("Bartek");
        list.remove("Krzysiek");
        list.remove("Alek");
        list.remove("Arek");
        for (String var : list) {
            System.out.println(var);
        }

        //Zadanie 2
        Set<String> setList = new TreeSet<>();
        setList.add("Bartek");
        setList.add("Bartek");
        setList.add("Krzysiek");
        setList.add("Alek");
        setList.add("Arek");
        setList.add("Adrian");
        setList.add("Patrycja");
        setList.add("Natalia");

        for (String var : setList) {
            System.out.println(var);
        }

        //Zadanie3
        Map<Integer, Double> map = new TreeMap<>();
        map.put(1, 10d);
        map.put(2, 11d);
        map.put(3, 12d);
        map.put(4, 13d);

        Set<Map.Entry<Integer, Double>> mapEntry = map.entrySet();
        for (Map.Entry var : mapEntry) {
            System.out.println(var.getKey() + " : " + var.getValue());

        }

        //Zadanie4
        Map<Integer, Map<Integer, Double>> taskForce = new TreeMap<>();
        taskForce.put(101, map);
        taskForce.put(102, map);
        taskForce.put(103, map);
        taskForce.put(104, map);


        //Zadanie5
        Map<Integer, Map<Integer, Double>> taskMap = new TreeMap<>();
        Map<Integer, Double> innerMap = new TreeMap<>();
        Set<Integer> keySet = taskForce.keySet();
        List<Integer> innerKeySet = new ArrayList<>(keySet);
        Set<Integer> innerKey = map.keySet();
        List<Integer> innerKeyList = new ArrayList<>(innerKey);
        int i = 0;
        double z = 0;
        for (Map.Entry inner : mapEntry) {

            double y = (double) inner.getValue();
            innerMap.put(innerKeySet.get(i), y);
            taskMap.put(innerKeyList.get((int) z), innerMap);
            i++;
            z++;

        }


        System.out.println(taskMap);


    }
}




