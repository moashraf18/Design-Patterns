public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Mohamed Ashraf Taha", "Team Design Member");
        Employee e2 = new Employee("Moamen Wael Saber", "Team Design Member");
        Employee e3 = new Employee("Fahd", "Team Design Member");
        Manager m1 = new Manager("Ahmed Reda", "Scrum Master");
        Manager m2 = new Manager("Mohamed Ashraf Mahmoud", "Team Design Leader");

        m2.addEmployee(e1);
        m2.addEmployee(e2);
        m2.addEmployee(e3);
        m1.addEmployee(m2);
        m1.showDetails();
    }
}