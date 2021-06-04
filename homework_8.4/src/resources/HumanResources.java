package src.resources;

import src.Company;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class HumanResources extends Company{

    protected TreeMap<String,Integer> employees = new TreeMap<>();

    public TreeMap<String, Integer> getEmployees() {
        for (Map.Entry check : employees.entrySet()) {
            System.out.println("Key = " + check.getKey() + " Value = " + check.getValue());
        }
        return employees;
    }
    public void newEmployee(String nameCandidate , Integer salary) {
        employees.put(nameCandidate,getIncome());
        System.out.println("Добро пожаловать " + nameCandidate + " Ваша зарплата составляет " + getIncome() + " руб");
    }

    public void newAllEmployee(ArrayList<String> namesCandidates) {
        for (String nameCandidate : namesCandidates) {
            employees.put(nameCandidate,getIncome());
            System.out.println("Добро пожаловать " + nameCandidate + " Ваша зарплата составляет " + getIncome() + " руб");
        }
    }
}
