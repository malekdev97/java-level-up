package classrelationships.dependency;

public class Employee implements DepartmentInjector{

    // Association + one-to-Many relationship + Dependency
    private Department department;

    // Dependency Injection 

    // Constructor Injection 
    public Employee(Department department) {
        this.department = department;
    }
    
    // Setter Injection
    public void setDepartment(Department department) {
        this.department = department;
    }

    // Interface Injection
    public void injectDepartment(Employee employee) {
        this.department = department;
    }
}
