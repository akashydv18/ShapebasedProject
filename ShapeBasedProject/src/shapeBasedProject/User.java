package shapeBasedProject;
import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1==>To start new Game");
		System.out.println("Press 2==>To Exit");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("=====New Game is Starting=====");
			char c;
			do {
				Game.startGame();
				System.out.println("Press Y/y to continue...");
				c=sc.next().charAt(0);
			}while(c=='Y' || c=='y');
			System.out.println("====Thank You! Game Ends!=====");
		}else {
			System.out.println("====Thank You! Game will End Now====");
			System.exit(1);
		}

	}

}
