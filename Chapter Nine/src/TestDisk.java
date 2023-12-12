public class TestDisk {
    public static void main(String[] args) {
        Disk saucer = new Disk(10, 0.02);

        System.out.println("Disk radius: " + saucer.getRadius());
        System.out.println("Disk surface area: " + saucer.area());
        System.out.println("Disk volume: " + saucer.volume());

        Disk plate1 = new Disk(12, .05);
        Disk plate2 = new Disk(12, .07);

        if (plate1.equals(plate2)) {
            System.out.println("The two plates are the same.");
        } else {
            System.out.println("The two plates are different.");
        }

        System.out.println(plate1);
        System.out.println(plate2);
    }

}
