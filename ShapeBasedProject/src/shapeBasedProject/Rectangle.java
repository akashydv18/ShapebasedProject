package shapeBasedProject;

public class Rectangle implements TwoDShape {
    double l, w;

    Rectangle(double l, double w) {
        if (l > 0) {
            this.l = l;
        } else {
            System.out.println("Length can't be -ve!");
        }

        if (w > 0) {
            this.w = w;
        } else {
            System.out.println("Width can't be -ve!");
        }
    }

    @Override
    public double area() {
        return l * w;
    }

    @Override
    public double perimeter() {
        return 2 * (l + w);
    }
}

