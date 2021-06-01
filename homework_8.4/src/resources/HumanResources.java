package src.resources;

import java.util.ArrayList;
import java.util.TreeMap;

public class HumanResources {

        public TreeMap<String,Integer> employees = new TreeMap<>();
        //void newEmployee(String name, Integer salary);

        public void employeeAll(ArrayList<String> namesCandidates, ArrayList<Integer> salaryOfCandidates) {
            for (String nameCandidate : namesCandidates) {
                for (Integer salaryCandidate : salaryOfCandidates) {
                    employees.put(nameCandidate, salaryCandidate);
                    break;
                }
            }
        }
}
