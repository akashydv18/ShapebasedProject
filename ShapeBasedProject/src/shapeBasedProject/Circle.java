package shapeBasedProject;

public class Circle implements TwoDShape {
	private double r;
	
	Circle(double r){
		if(r>0) {
			this.r=r;
		}else {
			System.out.println("Radius can't be Negative!");
		}
	}
	@Override
	public double area() {
		return Math.PI*r*r;
	}
	public double perimeter() {
		return 2*Math.PI*r;
	}

}
