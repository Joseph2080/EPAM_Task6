
public class Company {

    private Employee employee[];
    public Company(Employee employee[]){
        employee = employee;
    }

    public void giveEverybodyBonus(double companyBonus){
        for(Employee employee:employee){
            if(employee!=null) {
                employee.setBonus(companyBonus);
            }
        }
    }

    public void totalToPay(){
        double total = 0;
        for(Employee employee:employee){
            if(employee!=null) {
                total += employee.total();
            }
        }
    }

    public String nameMaxSalary(){
        String temp = "";
        int index = 0;
        double max = employee[0].total();
        for(int i =1;i < employee.length;i++){
            if(employee!=null) {
                if(max<employee[i].total()){
                    max = employee[i].total();
                    index = i;
                }
            }
        }
        return employee[index].getLastname() + " earned the most at " + employee[index].total() + " uah";

    }
}
