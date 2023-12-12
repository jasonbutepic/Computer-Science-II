public class Hockey {
    public static void main(String[] args) {
        Puck puck1 = new Puck(5.5);
        Puck puck2 = new Puck(4.5);

        System.out.println(puck1.getWeight());
        System.out.println(puck2.getWeight());
        System.out.println(puck1.getDivision());
        System.out.println(puck2.getDivision());
        System.out.println(puck1.equals(puck2));
        System.out.println(puck1.toString());
        System.out.println(puck2.toString());
    }
}
