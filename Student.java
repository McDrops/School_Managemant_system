package School.Management.System;

import School.Management.System.School;

public class Student {
    private int Id;
    private String Name;
    private int grade;
    private int feesTotal;
    private int feesPaid;

    public Student(int Id, String Name, int grade){
        this.Id = Id;
        this.Name = Name;
        this.grade = grade;
        this.feesTotal = 30000;
        this.feesPaid = 0;
    }


    public void setGrade(int grade) {
        this.grade = grade;
    }

   public void payFees(int fees){
        feesPaid+=fees;
        School.UpdateTotalMoneyEarned(feesPaid);
   }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Student's Name: " + Name +
                "Total feesPaid=" + feesPaid;
    }
}
