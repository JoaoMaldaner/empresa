package Company.Employers;

public non-sealed class CordSales extends Employee{
    private double salaryCord;
    private double percentParcialSold;
    private double comissionParcial;

    public CordSales(String cod,
                     String name,
                     String surname,
                     String email,
                     String phone,
                     String address,
                     String CPF,
                     int age,
                     String login,
                     String password) {
        super(cod, name, surname, email, phone, address, CPF, age, login, password);
    }

    public CordSales() {

    }


    public double getsalaryCord() {return salaryCord;}

    public void setSalaryCord(double salaryCord) {
        this.salaryCord = salaryCord;
    }
    public double getPercentParcialSold() {return percentParcialSold;}
    public void setPercentParcialSold(double percentParcialSold) {
        this.percentParcialSold = percentParcialSold;
    }
    public double getcomissionParcial() {return comissionParcial;}
    public void setcomissionParcial(double comissionParcial) {
        this.comissionParcial = comissionParcial;
    }
    @Override
    public String getCod(){
        return "CS" + this.cod;
    }

    @Override
    public double gettotalSalary() {
        return this.salaryCord + ((this.percentParcialSold * this.comissionParcial) / 100);
    }
}
