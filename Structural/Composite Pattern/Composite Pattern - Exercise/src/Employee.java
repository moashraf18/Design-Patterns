public class Employee implements EmployeeComponent {
    private String name;
    private String role;

    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public void showDetails() {
        System.out.println("Name: " + name + ", (Role: " + role + ")");

    }
}
