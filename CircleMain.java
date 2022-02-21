import java.util.Scanner;

public class CircleMain {
	
	public static void main(String[] args) {
		
		Scanner pointsInput = new Scanner(System.in);
		System.out.print("Enter the amount of points: ");
		int points = Integer.parseInt(pointsInput.nextLine());
		
		Scanner multInput = new Scanner(System.in);
		System.out.print("Enter the multiplier: ");
		int multiplier = Integer.parseInt(multInput.nextLine());
		calc(points, multiplier);
		new InputCircle(points, multiplier);
	}
	
public static void calc(int x, int y) {
		if (x <= 10) {
			System.out.print("The number of points is " + x + '\n');
			System.out.print("The multiplier is " + y + '\n');
			for(int i = 0; i < x; i++) {
				System.out.print(i + " ");
				System.out.println(i * y);
			}
		}
		else {
			for(int i = 0; i < x; i++) {
				System.out.print(i + " ");
				System.out.println(i * y);
			}
		}
	}
	
	
}
