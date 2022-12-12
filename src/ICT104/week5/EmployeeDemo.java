package ICT104.week5;

import java.util.Date;

class Employee {
    private String name;
    private String employeeNumber;
    private Date hireDate;
    Employee() {}
    Employee(String employeeNumber, String name, Date hireDate) {
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmployeeNumber() {
        return employeeNumber;
    }
    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
    public Date getHireDate() {
        return hireDate;
    }
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
}

class ProductionWorker extends Employee {
    private int shift;
    private double payRate;
    ProductionWorker(){}
    ProductionWorker(String employeeNumber, String name, Date hireDate, int shift, double payRate) {
        super(employeeNumber, name, hireDate);
        this.shift = shift;
        this.payRate = payRate;
    }
    public int getShift() {
        return shift;
    }
    public void setShift(int shift) {
        this.shift = shift;
    }
    public double getPayRate() {
        return payRate;
    }
    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
}

class TeamLeader extends ProductionWorker{
    private int monthlyBonus;
    private int requiredTrainingHours;
    private int trainingHoursAttended;
    TeamLeader(int monthlyBonus, int requiredTrainingHours, int trainingHoursAttended) {
        this.monthlyBonus = monthlyBonus;
        this.requiredTrainingHours = requiredTrainingHours;
        this.trainingHoursAttended = trainingHoursAttended;
    }
    public int getMonthlyBonus() {
        return monthlyBonus;
    }
    public void setMonthlyBonus(int monthlyBonus) {
        this.monthlyBonus = monthlyBonus;
    }
    public int getRequiredTrainingHours() {
        return requiredTrainingHours;
    }
    public void setRequiredTrainingHours(int requiredTrainingHours) {
        this.requiredTrainingHours = requiredTrainingHours;
    }
    public int getTrainingHoursAttended() {
        return trainingHoursAttended;
    }
    public void setTrainingHoursAttended(int trainingHoursAttended) {
        this.trainingHoursAttended = trainingHoursAttended;
    }
}


public class EmployeeDemo {
    public static void main(String[] args) {
        ProductionWorker pw = new ProductionWorker("123-A", "Lee", new Date(2018, 11, 18),0, 25);
        TeamLeader tl = new TeamLeader(200, 200, 300);
    }
}
