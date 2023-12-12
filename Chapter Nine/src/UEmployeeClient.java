public class UEmployeeClient {
    public static void main(String[] args) {
        Staff employee1 = new Staff("John Doe", 50000);
        Staff employee2 = new Staff("Jane Doe", 60000);
        Faculty employee3 = new Faculty("Jack Doe", 70000);
        Faculty employee4 = new Faculty("Jill Doe", 80000);

        employee1.setTitle("Manager");
        employee2.setTitle("Director");
        employee3.setDepartment("Mathematics");
        employee4.setDepartment("Computer Science");

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());
        System.out.println(employee4.toString());
        System.out.println("Employee 1's title is " + employee1.getTitle());
        System.out.println("Employee 2's title is " + employee2.getTitle());
        System.out.println("Employee 3's department is " + employee3.getDepartment());
        System.out.println("Employee 4's department is " + employee4.getDepartment());
    }
}
