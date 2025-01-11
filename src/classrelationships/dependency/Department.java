package classrelationships.dependency;

import java.util.List;

public class Department {
 
    private String name;
    private List<Employee> employees;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return this.employees;
    }
    
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
