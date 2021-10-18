package src.resources;


import src.ComparatopSalary;

import java.util.*;
import java.util.stream.Collectors;

public class Company {
    private List<Employee> allEmployees = new ArrayList<>();
    int allIncome = 0;

    public void hire(Employee employee) {
        allEmployees.add(employee);
        if (employee instanceof Manager) {
            allIncome = allIncome + ((Manager) employee).getIncome();
        }
        else if (employee instanceof TopManager) {
            if (allIncome > 10000000){

            }
        }
    }
    public void hireAll(List<Employee> employees) {
        allEmployees.addAll(employees);
        for (Employee employee : employees) {
            if (employee instanceof  Manager) {
                allIncome = allIncome + ((Manager) employee).getIncome();
            }
        }
    }
    public void fire(Employee employee) {
        allEmployees.remove(employee);
        if (employee instanceof Manager) {
            allIncome = allIncome - ((Manager) employee).getIncome();
        }
    }
    public Integer randomSalaryOperator(int random) {
       random  = (int) ( 50000 + Math.random() * 15000);
       return random;
    }

    public List<Employee> getAllEmployees() {
        return allEmployees;
    }

    public void setAllEmployees(List<Employee> allEmployees) {
        this.allEmployees = allEmployees;
    }

    public void getTopSalaryStaff(int count) {
        List<Employee> sortedList = getAllEmployees().stream().sorted(Comparator.comparingInt(Employee::getSalary)).collect(Collectors.toList());
        for (int i = 0; i < count; i++) {
            System.out.println(sortedList.get(i).getSalary());
        }
    }

    public void getLowestSalaryStaff(int count) {
        TreeSet<Employee> topSorted = new TreeSet<>(new ComparatopSalary());
        topSorted.addAll(getAllEmployees());
        Iterator<Employee> topSortedIterator = allEmployees.iterator();
        List<Employee> topSortedList = new ArrayList<>();
        for (int i = 0; i < count && topSortedIterator.hasNext(); i++) {
        Employee SalaryIterator = topSortedIterator.next();
        topSortedList.add(SalaryIterator);
        }
        System.out.println("Зарплаты в порядке убывания:");
        for (int i = 0; i < topSortedList.size(); i++) {
            System.out.println(topSortedList.get(i).getSalary());
        }
    }
}
