package homework;

public class Q3 {
    public static void main(String[] args) {
        double radius = diameterOfCircle(23.5);
        System.out.println("diameter of circle :"+radius);
        double circumference= circumferenceOfCircle(23.5);
        System.out.println("circumference of circle :"+circumference);
        double area= areaOfCircle(23.5);
        System.out.println("area of circle :"+area);


    }

    private static double areaOfCircle(double cevre) {
        return cevre*cevre*3.14;
    }

    private static double circumferenceOfCircle(double r) {
        return 2*3.14*r;
    }

    private static double diameterOfCircle(double radius) {
        return radius*2;

    }
}
