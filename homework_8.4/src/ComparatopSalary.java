package src;

import src.resources.Company;
import src.resources.Employee;
import src.resources.Manager;
import src.resources.Operator;

import java.util.Comparator;
import java.util.List;

public class ComparatopSalary implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getSalary() > o2.getSalary()) {
            return 1;
        }
        if (o1.getSalary() < o2.getSalary()) {
            return -1;
        }
        return 0;
    }
}
