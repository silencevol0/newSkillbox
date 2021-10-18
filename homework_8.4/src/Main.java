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
        //Manager manager = new Manager();
        //Operator operator = new Operator();
        //TopManager topManager = new TopManager();
        //List<Employee> allEmployees = new ArrayList<Employee>();

        for (int i = 0; i < 3; i++) {
            Operator operator = new Operator();
            operator.setName("Operator " + i);
            operator.setSalary(company.randomSalaryOperator(1));
            company.hire(operator);
            System.out.println("Имя оператора - " + operator.getName() + "\n" + "Зарплата оператора - " + operator.getSalary());
        }
        company.getTopSalaryStaff(3);
        company.getLowestSalaryStaff(3);
//        System.out.println("Добрый день, начните работу с кадровым учетом, напишите - 'Help' для просмотра функционала");
//        while (true) {
//            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//            String input = reader.readLine();
//            String replaceForCommand = input.replaceAll("[^a-zA-Z]", "");
//            switch (replaceForCommand.toUpperCase(Locale.ROOT)) {
//                case "HELP":
//                    System.out.println("Список комманд: \n\t ADD,ADD ALL, TD");
//                    break;
//                case "ADD":
//                    break;
//            }
//        }
    }
}
//        String[] people = new String[] {"Jake" , "123000" , "Operator"};
//        company.allEmployees.put(51,people);
//        company.hire();
//
//
//        company.allEmployees.
//                System.out.println(company.allEmployees.get(51)[0]);

//        HumanResources humanResources = new HumanResources();
//        for (int i = 0; i < 20 ; i++) {
//            humanResources.newEmployee("alex" + i,312);
//        }
//        ArrayList<String> names = new ArrayList<>();
//        names.add("Sergey");
//        names.add("Anton");
//        humanResources.newAllEmployee(names);
//        humanResources.getEmployees();
//
//
//
//
//    }

