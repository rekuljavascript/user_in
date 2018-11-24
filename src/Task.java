import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		int sum=0;
		int counter=1;
		
		
		while(counter<11) {
			System.out.println("Enter your number#"+counter);
			boolean bool=scanner.hasNextInt();
		
			if(bool) {
				counter++;
				int number = scanner.nextInt();
				sum+=number;
			}else {
				System.out.println("Invalid number");
			}
			scanner.nextLine();		}
		System.out.println("Your total is " + sum);
		scanner.close();
	}

}
