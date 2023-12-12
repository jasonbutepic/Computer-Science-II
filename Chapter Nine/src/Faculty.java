public class Faculty extends UEmployee{
    public Faculty(String name, double salary) {
        super(name, salary);
    }

    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    
}
