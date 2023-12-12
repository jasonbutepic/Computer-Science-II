public class Staff extends UEmployee {
    public Staff(String name, double salary) {
        super(name, salary);
    }

    private String title;

    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
