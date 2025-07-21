package Company.Employers;

public non-sealed class Manager extends Employee {

    private double salaryManager;
    private double totalComission;
    private boolean admin = true;

    public Manager (String cod,
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

    public Manager() {

    }


    public double getsalaryManager() {return salaryManager;}

    public double getTotalComission() {return totalComission;}

    public void setSalaryManager(double salaryManager) {
        this.salaryManager = salaryManager;
    }
    public void setTotalComission(double totalComission) {
        this.totalComission = totalComission;
    }

    @Override
    public String getCod(){
        return "MN" + this.cod;}

    @Override
    public double gettotalSalary() {
        return this.salaryManager + this.totalComission;
    }
}
