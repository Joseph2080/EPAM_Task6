
public class SalesPerson extends Employee {

    private int percent;
    public SalesPerson(String lastname, double salary, int percent){
        super(lastname,salary);
        this.percent = percent;
    }

    public void setBonus(double bonus){

        if(percent>=100&&percent<200){
            super.setBonus(bonus *=2);
        }
        if(percent>=200){
            super.setBonus(bonus *=3);
        }

    }
}
