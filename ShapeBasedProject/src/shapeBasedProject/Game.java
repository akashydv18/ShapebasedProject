package shapeBasedProject;
import java.util.*;
public class Game {
	static Scanner sc=new Scanner(System.in);
	static{
		System.out.println("====Game Has Started=====");
	}
	public static  void startGame() {
		System.out.println("Press 1===> For TwoDShape!\nPress 2===> For ThreeDShape!");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("You have selected TwoDShape");
			TwoDShape t1=selectTwoDShape();
			System.out.println("Area is: "+ t1.area());
			System.out.println("Perimeter is: "+t1.perimeter());
		}else if(choice==2) {
			System.out.println("You have selected ThreeDShape");
			ThreeDShape t1=selectThreeDShape();
			System.out.println("Voleme is: "+t1.volume());
			System.out.println("LSA is: "+t1.lsa());
			System.out.println("TSA is: "+ t1.tsa());
		}else {
			System.out.println("You have selected Invalid Options!");
			startGame();
		}
	}
	//Factory Method
		public static TwoDShape  selectTwoDShape() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Press 1===>For Circle\nPress 2===>For Rectangle");
	        int choice = sc.nextInt();
	        if(choice==1) {
	        	System.out.println("You have selected Circle");
	        	System.out.println("Enter radius of Circle:");
	        	double r=sc.nextDouble();
	        	Circle c=new Circle(r);
	        return c;
	        }
	        else if(choice==2) {
	        	System.out.println("You have selected Rectangle");
	        	System.out.println("Enter length of Rectangle:");
	        	double l=sc.nextDouble();
	        	System.out.println("Enter width of Rectangle:");
	        	double w=sc.nextDouble();
	        	return new Rectangle(l,w);
	        }else {
	        	System.out.println("Invalid Selection");
	        	return selectTwoDShape();
	        }
	    }
		
		//Factory Method
				public   static ThreeDShape    selectThreeDShape() {
					Scanner sc = new Scanner(System.in);
					System.out.println("Press 1===>For Cylinder\nPress 2===>For Sphere");
			        int choice = sc.nextInt();
			        if(choice==1) {
			        	System.out.println("You have selected Cylinder");
			        	System.out.println("Enter radius of Cylinder:");
			        	double r=sc.nextDouble();
			        	System.out.println("Enter Height of Cylinder:");
			        	double h=sc.nextDouble();
			        	Cylinder c=new Cylinder(r,h);
			        return c;
			        }
			        else if(choice==2) {
			        	System.out.println("You have selected Sphere");
			        	System.out.println("Enter radius:");
			        	double r=sc.nextDouble();
			        	return new Sphere(r);
			        }else {
			        	System.out.println("Invalid Selection");
			        	return selectThreeDShape();
			        }
			    }
}
