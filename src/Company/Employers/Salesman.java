package Company.Employers;

public non-sealed class Salesman extends Employee{

    private double salarySalesman;
    private double percentPerSold;
    private int salesAmount;



    public Salesman(String cod,
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

    public Salesman() {

    }



    public double getsalarySalesman() {return salarySalesman;}
    public void setsalarySalesman(double salarySalesman) {this.salarySalesman = salarySalesman;}

    public double getpercentPerSold() {return percentPerSold;}
    public void setPercentPerSold(double percentPerSold) {this.percentPerSold = percentPerSold;}
    public int getSalesAmount() {return salesAmount;}
    public void setSalesAmount(int salesAmount) {this.salesAmount = salesAmount;}

    @Override
    public String getCod(){
        return "SL" + this.cod;
    }


    @Override
    public double gettotalSalary() {
        return this.salarySalesman + ((this.percentPerSold * this.salesAmount) / 100);
    }
}
