package src;

import src.resources.HumanResources;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Main  {
    public static void main(String[] args) {
        HumanResources humanResources = new HumanResources();
        for (int i = 0; i < 20 ; i++) {
            humanResources.newEmployee("alex" + i,312);
        }
        ArrayList<String> names = new ArrayList<>();
        names.add("Sergey");
        names.add("Anton");
        humanResources.newAllEmployee(names);
        humanResources.getEmployees();




      //  ПРИДУМАТЬ КАК РЕАЛИЗОВАТЬ КЛАССЫ ВАКАНСИЙ И РАСКИДАТЬ МЕТОДЫ БЕЗ ДУБЛИРОВАНИЯ НА ОСНОВЕ ХУМАНРЕСУРС
    }
}
