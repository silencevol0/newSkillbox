package src.resources;

import com.github.javafaker.Faker;

public class TopManager implements Employee {

    private Integer salary;
    private String name;
    private int income;
    private String post;
    private String companyTopManager;
    Faker faker = new Faker();
    Company company = new Company();
    public TopManager ( String company) {
        this.companyTopManager = company;
    }


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
        if(company.getAllIncome() < 10000000) {
            this.salary = randomFixTopManagerSalary() + (int) (income * 0.05);
        }
        else {
            this.salary = (int)((randomFixTopManagerSalary() + (int) (income * 0.05)) * 1.5);
        }
    }

    @Override
    public void setName() {
        this.name = faker.name().firstName();

    }
    public int randomFixTopManagerSalary() {
        this.income = (int) ( 100000 + Math.random() * 15000);
        return this.income;
    }
    @Override
    public String getPost() {
        this.post = getClass().toString().replaceFirst(".*(?=\\.)." , "");
        return post;
    }
}
