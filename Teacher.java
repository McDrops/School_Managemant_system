package School.Management.System;

import School.Management.System.School;

public class Teacher {
    private int Id;
    private String Name;
    private int salary;
    public int salaryEarned;

    public Teacher(int Id,String Name,int salary){
        this.Id =Id;
        this.Name = Name;
        this.salary = salary;
        this.salaryEarned = 0;
        
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.UpdateTotalMoneySpent(salary);


    }

    @Override
    public String toString() {
        return "Name of the Teacher" + Name +
                "Total salary earned so far $ " + salary;
    }
}
