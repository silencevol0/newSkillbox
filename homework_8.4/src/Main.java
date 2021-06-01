package src;

import src.resources.HumanResources;

import java.util.ArrayList;
import java.util.TreeMap;

public class Main  {
    public static void main(String[] args) {
        HumanResources humanResources = new HumanResources();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> salaries = new ArrayList<>();

        for(int i = 0;i< 10;i++) {
            names.add("name" + i);
            salaries.add(i);
        }

        ДОБАВИТЬ ПЕРЕБОР НА КЕЙ ВАЛЬЮ , ДОБАВИТЬ В ТРИМАП, РАСПЕЧАТАТЬ ДЛЯ ПРОВЕРКИ!!
//        for (String name : names) {
//            System.out.println(name);
//        }
//        for (Integer salary : salaries){
//            System.out.println(salary);
//        }
        humanResources.employeeAll(names,salaries);
    }
}
