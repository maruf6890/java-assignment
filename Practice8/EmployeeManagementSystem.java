package Practice8;
abstract class Employee {
    protected String name;
    protected int id;
    protected String department;

    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public abstract double calculatePay();

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

class FullTimeEmployee extends Employee {
    private double fixedSalary;

    public FullTimeEmployee(String name, int id, String department, double fixedSalary) {
        super(name, id, department);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculatePay() {
        return fixedSalary;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Full-Time");
        System.out.println("Fixed Salary: $" + fixedSalary);
        System.out.println("Pay: $" + calculatePay());
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id, String department, double hourlyRate, int hoursWorked) {
        super(name, id, department);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Part-Time");
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Pay: $" + calculatePay());
    }
}

class ContractEmployee extends Employee {
    private String projectName;
    private double contractAmount;

    public ContractEmployee(String name, int id, String department, String projectName, double contractAmount) {
        super(name, id, department);
        this.projectName = projectName;
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculatePay() {
        return contractAmount;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Contract");
        System.out.println("Project Name: " + projectName);
        System.out.println("Contract Amount: $" + contractAmount);
        System.out.println("Pay: $" + calculatePay());
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee("Alice", 101, "HR", 5000.0);

    }
}