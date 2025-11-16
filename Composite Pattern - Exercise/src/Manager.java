import java.util.ArrayList;
import java.util.List;

public class Manager implements EmployeeComponent {
    private String name;
    private String role;

    private List<EmployeeComponent> employees = new ArrayList<EmployeeComponent>();

    Manager(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void addEmployee(EmployeeComponent employee) {
        employees.add(employee);
    }

    public void removeEmployee(EmployeeComponent employee) {
        employees.remove(employee);
    }


    @Override
    public void showDetails() {
        System.out.println("Name: " + name + ", (Role: " + role + ")");
        for (EmployeeComponent employee : employees) {
            employee.showDetails();
        }
    }
}
