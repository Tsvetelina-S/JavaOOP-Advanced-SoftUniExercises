package SortByNameAndAge;

import java.text.DecimalFormat;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, double salary) {
        this(firstName,lastName,age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void increaseSalary(double bonus){
        if(this.age < 30){
            bonus/= 2;
        }
        this.salary = this.salary +(this.salary * bonus);
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.0####");
        return String.format("%s %s gets %s leva.",this.firstName,this.lastName,df.format(this.salary));
    }
}
