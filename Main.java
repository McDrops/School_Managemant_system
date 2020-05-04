package School.Management.System;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Teacher a = new Teacher(1,"a",500);
        Teacher b = new Teacher(2,"b",1000);
        Teacher c = new Teacher(3,"c",2000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(a);
        teacherList.add(b);
        teacherList.add(c);

        Student d = new Student(4,"d",4);
        Student e = new Student(5,"e",5);
        Student f = new Student(6,"f",6);

        List<Student> studentList = new ArrayList<>();
        studentList.add(d);
        studentList.add(e);
        studentList.add(f);

        School ghs = new School(teacherList,studentList);

        Teacher g = new Teacher(1,"g",900);
        ghs.addTeachers(g);
        d.payFees(10000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());
        e.payFees(100000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

        System.out.println("-----------------Making School Pay Salary--------------------");
        a.receiveSalary(a.getSalary());
        System.out.println("GHS has spent for salary to " + a.getName() + " and now has"
        + ghs.getTotalMoneyEarned());
        b.receiveSalary(b.getSalary());
        System.out.println("GHS has spent for salary to " + b.getName() + " and now has"
                + ghs.getTotalMoneyEarned());
        System.out.println(f);
        b.receiveSalary(b.getSalary());
        System.out.println(b);
    }
}
