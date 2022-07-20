import java.util.Scanner;
public class calculateSum {
    public static void main(String[] args) {
        int x, y;
        int guess;

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Please enter 1st number : ");
            x = scan.nextInt();
            System.out.println("Please enter 2nd number : ");
            y = scan.nextInt();
            System.out.println("Please enter number you think the sum will be : ");
            guess = scan.nextInt();
        }

        
        int sum = x + y;

        if(sum == guess)
        {
             System.out.println("true");
        }
        else
        {
            System.out.println("true");
        }

    }
}
