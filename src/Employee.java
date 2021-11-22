public class Employee {
    
    private String lastname;
    private double salary;
    private double bonus;

    public Employee(String lastname,double salary){
        this.lastname = lastname;
        this.salary = salary;
        bonus = 0;
    }

    public  void setBonus(double bonus){
        this.bonus = bonus;
    }

    public double total(){
        return salary+bonus;
    }

    public String toPay(){
        return "Salary: " + salary + " uah\nBonus : " +
                bonus + "\nTotal:" + (salary + bonus);
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
