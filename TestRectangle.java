import java.util.Scanner;

class TestRectangle {
    int l, b, area;

    public void insertData() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length of rectangle: ");
        l = s.nextInt();
        System.out.println("Enter breadth of rectangle: ");
        b = s.nextInt();

    }

    public void printArea() {
        area = l * b;
        System.out.println("Area of rectangle is: " + area);
    }
}
