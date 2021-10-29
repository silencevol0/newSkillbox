package src;

import src.resources.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        Company company = new Company();

        for (int i = 0; i < 180; i++) {
            Operator operator = new Operator();
            operator.setName();
            operator.setSalary();
            company.hire(operator);
        }
        for (int i = 0; i < 80; i++) {
            Manager manager = new Manager();
            manager.setName();
            manager.setSalary();
            company.hire(manager);
        }
        for (int i = 0; i < 10; i++) {
            TopManager topManager = new TopManager("Microsoft");
            topManager.setName();
            topManager.setSalary();
            company.hire(topManager);
        }
        System.out.println(company.getTopSalaryStaff(5).toString());
        //System.out.println(company.getAllEmployees().size()+ "<<<<< количество сотрудников в компании");
        //company.getTopSalaryStaff(270);


//        company.getLowestSalaryStaff(30);
//        Integer i = 1;
//        while (i < company.getAllEmployees().size()) {
//            if (i % 2 == 0) {
//                company.fire(company.getAllEmployees().get(i));
//            }
//                i++;
//        }
//        company.getTopSalaryStaff(15);
//        company.getLowestSalaryStaff(30);
    }
}
