class Employee {
    String name;
    double basicSalary;

    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public void display() {
        System.out.println("Employee: " + name);
    }

    public void calcSalary() {
        System.out.println("Salary: $" + basicSalary);
    }
}

class Engineer extends Employee {
    private double bonus;

    public Engineer(String name, double basicSalary, double bonus) {
        super(name, basicSalary);
        this.bonus = bonus;
    }

    public void calcSalary() {
        double totalSalary = basicSalary + bonus;
        System.out.println("Engineer Salary: $" + totalSalary);
    }
}

public class Java92 {
    public static void main(String[] args) {
        // Using a single object instantiation
        Employee emp = new Engineer("John Doe", 50000.0, 10000.0);

        // Displaying engineer salary
        emp.calcSalary();

        // Displaying using the display() method from the Employee class
        emp.display();
    }
}
