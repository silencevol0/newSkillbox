package src.resources;

public class TopManager implements Employee {

    private Integer salary;
    private String name;
    private int income;

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
        this.salary = salary + (int)(income * 0.05);

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
