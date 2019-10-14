import java.util.Scanner;

public class JavaLab2 {

	




		public static void main(String[] args) {

			double length = 0.0;
			double width = 0.1;
			double area = 1.1;
			double height = 2.0;
			double perimeter = 2.2;
			double volume = 3.0;
			String y = "Yes";
		

			while (y.equalsIgnoreCase("yes")) {
				
				Scanner user = new Scanner(System.in);
			System.out.println("Welcome to Grand Circus' Room Detail Generator!");
			
			
			
				
			
			System.out.println("Enter the width of the classroom");
			width = user.nextDouble();
			System.out.println("Now enter the length of the classrom");
			length = user.nextDouble();
			System.out.println("Now enter the height of your classroom");
			height = user.nextDouble();
			
			area = width * length;
			perimeter = width* 2 + length * 2;
			volume = width* height* length;
			System.out.println("");
			System.out.println("The area of your classroom is " + area);
		
			System.out.println("The perimeter of your classroom is " + perimeter);
		
			System.out.println("The volume of your classroom is " + volume);
			System.out.println("");
			
			System.out.println("Would you like to continue Yes/No");	
			y = user.next();
			
			
			
			
			}
			System.out.println("Program has now ended!");
			
			
			
			
		}
	
}
