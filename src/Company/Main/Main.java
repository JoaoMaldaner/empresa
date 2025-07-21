package Company.Main;
/*Importando as classes*/
import Company.Employers.CordSales;
import Company.Employers.Employee;
import Company.Employers.Manager;
import Company.Employers.Salesman;
/*Construtor das classes*/
public class Main {
    public static void main(String[] args) {
        printEmployee(new Manager());
        printEmployee(new CordSales());
        printEmployee(new Salesman());

    }
    /*definindo os dados das classes atraves do definido em cada classe ou herdado da classe pai*/
    public static void printEmployee(Employee employee) {
        System.out.printf("-------%s-------\n", employee.getClass().getCanonicalName());
        switch (employee){
            case Manager manager -> {
                manager.setCod("123");
                manager.setName("Joao");
                manager.setSurname("Maldaner");
                manager.setEmail("joaomaldaner@company.com");
                manager.setPhone("51919198282");
                manager.setAddress("Olaria 90");
                manager.setCPF("999.111.222.-88");
                manager.setAge(30);
                manager.setLogin("joaoM123");
                manager.setPassword("Fusca@123");
                manager.setSalaryManager(5000);
                manager.setTotalComission(500);


                System.out.println(manager.getCod());
                System.out.println(manager.getName());
                System.out.println(manager.getSurname());
                System.out.println(manager.getEmail());
                System.out.println(manager.getPhone());
                System.out.println(manager.getAddress());
                System.out.println(manager.getCPF());
                System.out.println(manager.getAge());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
                System.out.println(manager.getsalaryManager());
                System.out.println(manager.getTotalComission());

            }
            case CordSales cordSales -> {
                cordSales.setCod("124");
                cordSales.setName("Mario");
                cordSales.setSurname("Bros");
                cordSales.setEmail("mariobros@company.com");
                cordSales.setPhone("51919198282");
                cordSales.setAddress("campinas 190");
                cordSales.setCPF("994.112.333.-88");
                cordSales.setAge(27);
                cordSales.setLogin("mariob124");
                cordSales.setPassword("Kert@123");
                cordSales.setSalaryCord(3800);
                cordSales.setPercentParcialSold(5);
                cordSales.setcomissionParcial(6000);

                System.out.println(cordSales.getCod());
                System.out.println(cordSales.getName());
                System.out.println(cordSales.getSurname());
                System.out.println(cordSales.getEmail());
                System.out.println(cordSales.getPhone());
                System.out.println(cordSales.getAddress());
                System.out.println(cordSales.getCPF());
                System.out.println(cordSales.getAge());
                System.out.println(cordSales.getLogin());
                System.out.println(cordSales.getPassword());
                System.out.println(cordSales.getsalaryCord());
                System.out.println(cordSales.getPercentParcialSold());
                System.out.println(cordSales.getcomissionParcial());
            }

        case Salesman salesman -> {
                salesman.setCod("125");
                salesman.setName("Junior");
                salesman.setSurname("Silva");
                salesman.setEmail("juniorsilva@company.com");
                salesman.setPhone("51919998877");
                salesman.setAddress("andradas 200");
                salesman.setCPF("992.122.298.-00");
                salesman.setAge(20);
                salesman.setLogin("juniorsilva");
                salesman.setPassword("Junior@123");
                salesman.setsalarySalesman(2000);
                salesman.setPercentPerSold(10);
                salesman.setSalesAmount(1300);

                System.out.println(salesman.getCod());
                System.out.println(salesman.getName());
                System.out.println(salesman.getSurname());
                System.out.println(salesman.getEmail());
                System.out.println(salesman.getPhone());
                System.out.println(salesman.getAddress());
                System.out.println(salesman.getCPF());
                System.out.println(salesman.getAge());
                System.out.println(salesman.getLogin());
                System.out.println(salesman.getPassword());
                System.out.println(salesman.getsalarySalesman());
                System.out.println(salesman.getpercentPerSold());
                System.out.println(salesman.getSalesAmount());


            }

        }
        System.out.println(employee.gettotalSalary());
        System.out.println("====================");


    }


}
