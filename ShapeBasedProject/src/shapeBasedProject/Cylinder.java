package shapeBasedProject;

public class Cylinder implements ThreeDShape {
	double r,h;
	
	Cylinder(double r, double h){
		if(r>0) {
			this.r=r;
		} else {
			System.out.println("Radius can't be -ve!");
		}
		if(h>0) {
			this.h=h;
		}else {
			System.out.println("Height can't be -ve!");
		}
	}
	@Override
	public double volume() {
		return Math.PI*r*r*h;
	}
	@Override
	public double lsa() {
		return 2*Math.PI*r*h;
	}
	@Override
	public double tsa() {
		return 2*Math.PI*r*(r+h);
	}
	

}
