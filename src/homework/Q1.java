package homework;

public class Q1 {
    private String name;
    private int count;
    private double price;


    public Q1() {
    }

    public Q1(String name, int count, double price) {
        this.name = name;
        this.count = count;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Q1{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(totalPrice(5, 10));
    }

    public static double totalPrice(int count, double price) {
        if (count<=0 || price<=0){
            System.out.println("count and price must be greater than 0");
        }
        return count*price;
    }

}
