//inheritance--> kalıtım
//customer ve employee ortak özelliklere sahip nesneler ve iki nesne de kişi.Bu nedenle ortak bir person classı oluşturuyorum.
//Ortak alanları da oraya ekleyeceğim id,firstName,lastName ve age gibi :)
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();
        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();
    }
}