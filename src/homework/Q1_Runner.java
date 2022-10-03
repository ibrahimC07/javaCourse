package homework;

public class Q1_Runner {
    public static void main(String[] args) {

        Q1 cons = new Q1();
        System.out.println(cons.getName());
        System.out.println(cons.getCount());
        System.out.println(cons.getCount());
        cons.setName("Car");
        cons.setCount(10);
        cons.setPrice(2.5);
        System.out.println(cons.toString());
    }
}
