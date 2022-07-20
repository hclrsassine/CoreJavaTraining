class swapVariable
{
    public static void main(String[] args) {
        int x = 25;
        int y = 300;

        System.out.println("Before swap : " + x + " " + y);

        int temp  = x;
        x = y;
        y = temp;

        System.out.println("After swap : " + x + " " + y);

    }
}