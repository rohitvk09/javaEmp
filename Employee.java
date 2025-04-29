

public class Employee {
    String name;
    int id;
    double salary;
    String adress;

    public Employee(String name, int id, double salary, String adress){
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.adress = adress;
    }

    public void displayInfo(){
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Your adress is: " + adress);

    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Rohit", 108,20000, "You are in KLE tech");
        emp1.displayInfo();
    }
    
}