
public class Manager extends Employee {

    private int clients;
    public Manager(String lastname,double salary,int clients){
        super(lastname, salary);
        this.clients = clients;
    }

    public void setBonus(double bonus){
        if(clients>100&&clients>150){
            setBonus(bonus+500);
        }

        if(clients>=150){
            setBonus(bonus+1000);
        }
    }

}
