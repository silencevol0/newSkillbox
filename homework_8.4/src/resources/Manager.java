package src.resources;

public class Manager implements Employee {


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
        getIncome();
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

    public int getIncome() {
        this.income = (int) ( 115000 + Math.random() * 25000);
        return this.income;
    }
}
