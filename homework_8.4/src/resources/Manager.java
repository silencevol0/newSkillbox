package src.resources;

import src.Company;

public class Manager extends HumanResources {

    @Override
    public int getIncome() {
        int salary = (int) ( 115000 + Math.random() * 25000);
        return (int) (salary * 0.05) + salary;
    }

    @Override
    public void newEmployee(String nameCandidate,Integer salary) {
        employees.put(nameCandidate,20000 * getIncome());
        System.out.println("Добро пожаловать " + nameCandidate + " Ваша зарплата составляет " + getIncome() + " руб");
    }
}
