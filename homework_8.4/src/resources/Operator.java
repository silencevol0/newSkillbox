package src.resources;

import com.github.javafaker.Faker;

public class Operator implements Employee {

    private Integer salary;
    private String name;
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
        this.salary = randomFixOperatorSalary(1);
    }

    @Override
    public void setName() {
        this.name = faker.name().firstName();
    }

    public Integer randomFixOperatorSalary(int random) {
        random  = (int) ( 50000 + Math.random() * 15000);
        return random;
    }
    @Override
    public String getPost() {
        this.post = getClass().toString().replaceFirst(".*(?=\\.)." , "");
        return post;
    }
}
