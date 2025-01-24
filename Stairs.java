import java.util.Scanner;

public class Stairs {
    public static void main(String args[]) {
        Scanner character = new Scanner(System.in);
        System.out.println("Enter a character: "); 
        String charEntered = character.nextLine();

        System.out.println("Enter number of steps: "); 
        int stepsEntered = character.nextInt();

        for (int row = 0; row < stepsEntered; row++) {
			for (int col = 0; col < stepsEntered; col++) {
				if (col < stepsEntered - row - 1)
					System.out.print(" ");
				else
					System.out.print(charEntered);
			}
			System.out.println();
		}

    }
}
