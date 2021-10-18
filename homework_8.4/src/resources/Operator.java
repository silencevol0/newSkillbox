package src.resources;

public class Operator implements Employee {

    private Integer salary;
    private String name;

    @Override
    public Integer getSalary() {
        return salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setSalary(Integer salary) {
        this.salary = salary;

    }

    @Override
    public void setName(String name) {
        this.name = name;

    }

    @Override
    public int getMonthSalary() {
        return 0;
    }
}
