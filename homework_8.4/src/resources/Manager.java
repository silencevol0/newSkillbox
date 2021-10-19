package src.resources;

import com.github.javafaker.Faker;

public class Manager implements Employee {


    private Integer salary;
    private String name;
    private int income;
    private String post;
    Faker faker = new Faker();


    @Override
    public Integer getSalary() {
        return salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setSalary() {
        this.salary = randomFixManagerSalary() + (int)(income * 0.05);
    }

    @Override
    public void setName() {
        this.name = faker.name().firstName();

    }

    public int randomFixManagerSalary() {
        this.income = (int) ( 115000 + Math.random() * 25000);
        return this.income;
    }

    @Override
    public String getPost() {
        this.post = getClass().toString().replaceFirst(".*(?=\\.)." , "");
        return post;
    }
}
