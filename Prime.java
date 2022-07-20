import java.util.Scanner;
public class Prime {
    static boolean isPrime(int n)
    {
        if(n==1||n==0)
        {
            return false;
        }

        for(int i = 2;i < n; i++)
        {
            if(n%1 == 0)
            {
               return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Please enter an integer");
            int n = scan.nextInt();

            for(int i = 1;i <= n; i++)
            {
                if(isPrime(i))
                {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
