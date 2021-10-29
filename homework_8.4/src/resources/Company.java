package src.resources;


import src.ComparatopSalary;

import java.util.*;
import java.util.stream.Collectors;

public class Company {
    private List<Employee> allEmployees = new ArrayList<>();
    private int allIncome = 0;

    public void hire(Employee employee) {
        allEmployees.add(employee);
        if (employee instanceof Manager) {
            allIncome = getAllIncome() + employee.getSalary();
        }
    }
    public void hireAll(List<Employee> employees) {
        allEmployees.addAll(employees);
        for (Employee employee : employees) {
            if (employee instanceof  Manager) {
                allIncome = getAllIncome() + employee.getSalary();
            }
        }
    }
    public void fire(Employee employee) {
        System.out.println("\nСписок уволенных:\n");
        System.out.println(employee.getName() + " Сотрудник уволен его должность была - " + employee.getPost());
        allEmployees.remove(employee);
        if (employee instanceof Manager) {
            allIncome = getAllIncome() - employee.getSalary();
        }
    }

    public int getAllIncome() {
        return allIncome;
    }

    public List<Employee> getAllEmployees() {
        return allEmployees;
    }


    public List<Employee> getTopSalaryStaff(int count) {
        List<Employee> sortedList = new ArrayList<>();
        if (count < 1 || count > allEmployees.size()) {
            System.out.println("Сотрудников меньше, чем список который вы хотите вывести, либо вы вводите отрицательное число");
            return null;
        }
        else {
            sortedList = getAllEmployees().stream().sorted(Comparator.comparingInt(Employee::getSalary)).collect(Collectors.toList());
            System.out.println("\nЗарплаты в порядке возрастания:\n");
            for (int i = 0; i < count; i++) {
                System.out.println("Имя сотрудника - " + sortedList.get(i).getName()
                        + ", Зарплата сотрудника - " + sortedList.get(i).getSalary() + ", Должность сотрудника " + sortedList.get(i).getPost());
            }
        }  return sortedList;

    }

    public List<Employee> getLowestSalaryStaff(int count) {
        if (count < 1 || count > allEmployees.size()) {
            System.out.println("Сотрудников меньше, чем список который вы хотите вывести, либо вы вводите отрицательное число");
            return null;
        }
        else {
            TreeSet<Employee> topSorted = new TreeSet<>(new ComparatopSalary());
            topSorted.addAll(getAllEmployees());
            Iterator<Employee> topSortedIterator = topSorted.iterator();
            List<Employee> topSortedList = new ArrayList<>();
            for (int i = 0; i < count && topSortedIterator.hasNext(); i++) {
                Employee SalaryIterator = topSortedIterator.next();
                topSortedList.add(SalaryIterator);
            }
            System.out.println("\nЗарплаты в порядке убывания:\n");
            for (int i = 0; i < topSortedList.size(); i++) {
                System.out.println("Имя сотрудника - " + topSortedList.get(i).getName()
                        + ", Зарплата сотрудника - " + topSortedList.get(i).getSalary() + ", Должность сотрудника " + topSortedList.get(i).getPost());
            }
            return topSortedList;
        }
    }
}
