package Company.Employers;

public sealed abstract class Employee permits Salesman, CordSales, Manager {

    protected String cod;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String address;
    private String CPF;
    private int age;
    private String login;
    private String password;

    public Employee(String cod,
                    String name,
                    String surname,
                    String email,
                    String phone,
                    String address,
                    String CPF,
                    int age,
                    String login,
                    String password) {
        this.cod = cod;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.CPF = CPF;
        this.age = age;
        this.login = login;
        this.password = password;
    }

    public Employee() {

    }

    public String getCod() {
        return cod;
    }
    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public abstract double gettotalSalary ();




}

