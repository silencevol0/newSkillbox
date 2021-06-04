package src.resources;

public class Operator extends HumanResources {


    @Override
    public void newEmployee(String nameCandidate,Integer salary) {
        employees.put(nameCandidate,20000);
        System.out.println("Добро пожаловать " + nameCandidate + " Ваша зарплата составляет " + "20.000" + " руб");
    }
}
