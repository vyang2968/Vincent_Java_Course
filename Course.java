import java.util.Scanner;

public class Course {
    int u = 0;

    public Course(int h, double f) {
        double z = h + f;
        
        System.out.println("this is z: " + z);
    }

    public double divideZ(int h, double f) {
        double p = h % f + f * 2;
        return p;
    }

    public static void main(String[] args) {
        int x = 1;
        double y = 2.0;
        Course name = new Course(x, y);

        double l = name.divideZ(5, 2);
        System.out.println("this is l: " + l);
    }
}