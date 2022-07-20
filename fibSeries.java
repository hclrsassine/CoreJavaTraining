import java.util.Scanner;

class fibSeries
{
    //Declare Scanner object and Integer to read input 
   public static void main(String[] args) {
       
   
    try (Scanner scan = new Scanner(System.in)) {
        int n = scan.nextInt();

        //first check
        if(n > 1)
        {   
            System.out.println("Fib Numbers less than" + n + " are");
            System.out.print("1, 1, ");

            int f2 = 1;
            int fib = 1;
            for(int i = 1; i+f2 < n;)
            {
                fib = i = f2;
                i = f2;
                f2 = fib;
                System.out.println(fib + ", ");
            }
        }
        else{
            System.out.println("There are no numbers less than" + n  + " .");
        }
    }
}
}