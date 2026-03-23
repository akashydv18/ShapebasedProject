package shapeBasedProject;

public class Sphere implements ThreeDShape {
	double r;
	
	Sphere(double r){
		if(r>0) {
			this.r=r;
		}else {
			System.out.println("Radius can't be Negative!");
		}
	}
	@Override
	public double volume() {
		return (4.0/3)*Math.PI*r*r*r;
	}
	@Override
	public double lsa() {
		return 4*Math.PI*r*r;
	}
	@Override
	public double tsa() {
		return 4*Math.PI*r*r;
	}

}
